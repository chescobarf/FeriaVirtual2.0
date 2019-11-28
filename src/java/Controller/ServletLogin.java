/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import LibreriaClases.Login;
import LibreriaClases.Persona;
import com.google.gson.Gson;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.ws.WebServiceRef;
import org.tempuri.OpenServices;

/**
 *
 * @author AlexanderArevalo
 */
public class ServletLogin extends HttpServlet {
    @WebServiceRef(wsdlLocation = "http://3.225.20.205/CoreServicios/OpenServices.svc?wsdl")
    private OpenServices service;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        String pass = request.getParameter("txtPass");
        int user = Integer.parseInt(request.getParameter("txtUser"));
        
        
        Login userLogin = new Login();
        userLogin.setPassword(pass);
        userLogin.setUsuario(user);
        
        
        //Generamos la referencia con Objeto JSON
        Gson gson = new Gson();
        String JSON = gson.toJson(userLogin);
        String resp = null;
        
        //Abrir conexión con el servicio
        try {
            String respJson = this.validarLogin(JSON);
            Persona respPer = gson.fromJson(respJson, Persona.class);
            resp = respPer.toString();
            
            if(resp == null){
                response.sendRedirect("index.jsp?status=fail");
            } else {
                //Abrimos sesión
                HttpSession sesion = request.getSession();
                sesion.setAttribute("usuario", respPer.getRut());
                sesion.setAttribute("nombre", respPer.getNombre()+" "+respPer.getApellido());
                sesion.setAttribute("perfil", respPer.getPerfil());
                
                switch (respPer.getPerfil()) {
                    case 1:
                        response.sendRedirect("Home2.jsp");
                        break;
                    case 2:
                        response.sendRedirect("homeProductor.jsp");
                        break;
                    case 3:
                        response.sendRedirect("transportista.jsp");
                        break;
                    case 4:
                        response.sendRedirect("homeClienteEx.jsp");
                        break;
                    case 5:
                        response.sendRedirect("homeClienteInt.jsp");
                        break;
                    case 6:
                        response.sendRedirect("homeConsultor.jsp");
                        break;
                    case 7:
                        response.sendRedirect("homeComerciante.jsp");
                        break;
                    default:
                        response.sendRedirect("homeEjecutivo.jsp");
                        break;
                }
            }
            
        } catch (Exception e) {
            response.sendRedirect("index.jsp?status=tryConnection");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private String validarLogin(java.lang.String loginJson) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        org.tempuri.IOpenServices port = service.getBasicHttpBindingIOpenServices();
        return port.validarLogin(loginJson);
    }


}
