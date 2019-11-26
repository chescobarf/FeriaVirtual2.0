/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import LibreriaClases.SolicitudProducto;
import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;
import org.tempuri.OpenServices;

/**
 *
 * @author gerar
 */
@WebServlet(name = "ServletSolProducto", urlPatterns = {"/ServletSolProducto"})
public class ServletSolProducto extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/3.225.20.205/CoreServicios/OpenServices.svc.wsdl")
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
      
            //Se capturan los datos desde el JSP
            int cantidad = Integer.parseInt(request.getParameter("numCant"));
            int idfruta = Integer.parseInt(request.getParameter("productos"));
            int idpro = Integer.parseInt(request.getParameter("idproceso"));
            
            SolicitudProducto solproducto = new SolicitudProducto(idfruta, idpro, cantidad);
            
            //Se crea el Json con los datos de la solicitud
            Gson gson = new Gson();
            String JSON = gson.toJson(solproducto);
            String alert = null;

            if(this.createOfertaPrVta(JSON) == false){
               alert = "Error";
               response.sendRedirect("ingresarProductos.jsp?alert" + alert);
           }else{
              alert = "EXITO";
              response.sendRedirect("homeProductor.jsp?alert="+alert);
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

    private Boolean createOfertaPrVta(java.lang.String jsonProcesoVTA) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        org.tempuri.IOpenServices port = service.getBasicHttpBindingIOpenServices();
        return port.createOfertaPrVta(jsonProcesoVTA);
    }

}
