/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import LibreriaClases.Contrato;
import LibreriaClases.ProcesoVenta;
import com.google.gson.Gson;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
@WebServlet(name = "ServletContrato", urlPatterns = {"/ServletContrato"})
public class ServletContrato extends HttpServlet {

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

        int idcon = 0;
        String inicial = request.getParameter("feini");
        String fin = request.getParameter("fefin");
        Date date = new Date();
        try {
            
            SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy");
            date = format.parse(inicial);
        
        } catch (Exception e) {
          
        }   
        try {
            
            SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy");
            date = format.parse(fin);
        } catch (Exception e) {
            
        }
        
        String pdf = request.getParameter("txtPdf");
        int rut = Integer.parseInt(request.getParameter("numRut"));

        Contrato cont = new Contrato(idcon,date,date,pdf,rut);
        
        Gson gson = new Gson();
        String JSON = gson.toJson(cont);
        String resp = null;
        String alert = null;
       
        if(this.createContrato(JSON) == false){
            alert = "Error";
            response.sendRedirect("Contratos.jsp");
        }else{
            alert = "Exito";
            System.out.println("Agregado Exitosamente");
        }
 
        response.sendRedirect("Home2.jsp?alert="+alert);
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

    private Boolean createContrato(java.lang.String contratoJson) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        org.tempuri.IOpenServices port = service.getBasicHttpBindingIOpenServices();
        return port.createContrato(contratoJson);
    }

}
