/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import LibreriaClases.Fruta;
import LibreriaClases.ProcesoVenta;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
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
@WebServlet(name = "ServletComboBox", urlPatterns = {"/ServletComboBox"})
public class ServletComboBox extends HttpServlet {

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

        //Se guardan en una lista las frutas 
        String respJson = this.getAllFruta();
        Type listType = new TypeToken<ArrayList<Fruta>>(){}.getType();
        List<Fruta> listafruta = new Gson().fromJson(respJson, listType);
        
        //Guarda en una lista los procesos de venta en JSON
        String respJson1 = this.getAllProVenta();
        Type listType1 = new TypeToken<ArrayList<ProcesoVenta>>(){}.getType();
        List<ProcesoVenta> listaproventa = new Gson().fromJson(respJson1, listType1); 
        
        int idpro = Integer.parseInt(request.getParameter("idProceso"));
        
        ProcesoVenta proventa = null;
        
        for (int i = 0; i < listaproventa.size(); i++) {
            if (idpro == listaproventa.get(i).getIdProcesoVenta()) {
                proventa = listaproventa.get(i);
            }
        }
        System.out.println(proventa);
        request.setAttribute("proventa", proventa);
        request.setAttribute("listaDatosFrutas", listafruta);
        request.getRequestDispatcher("ingresarProductos.jsp").forward(request, response);
        
        
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

    private String getAllFruta() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        org.tempuri.IOpenServices port = service.getBasicHttpBindingIOpenServices();
        return port.getAllFruta();
    }

    private String getAllProVenta() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        org.tempuri.IOpenServices port = service.getBasicHttpBindingIOpenServices();
        return port.getAllProVenta();
    }

    

}
