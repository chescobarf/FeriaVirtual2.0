/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import LibreriaClases.SolicitudProducto;
import LibreriaClases.Subasta_Transporte;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "ServletListarSubastas", urlPatterns = {"/ServletListarSubastas"})
public class ServletListarSubastas extends HttpServlet {

    @WebServiceRef(wsdlLocation = "http://3.225.20.205/OpenServices.svc?wsdl")
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
        //Guarda en una lista los procesos de venta en JSON
        String respJson = this.getAllSubTransporte();
        Type listType = new TypeToken<ArrayList<Subasta_Transporte>>(){}.getType();
        List<Subasta_Transporte> listadoSubastas = new Gson().fromJson(respJson, listType);
        
        //Recorrer los procesos de venta y asignarlos en una nueva lista
        //ArrayList<String> SolicFruitPV = new ArrayList<String>();      
        //Lista de proceso de venta local
        List<Subasta_Transporte> SolicSubastas = new ArrayList<Subasta_Transporte>();
        
        for (Subasta_Transporte temp : listadoSubastas) {
                String estado = "";
                String refrigeracion = "";
                
                if("1".equals(temp.getEstado())){
                    estado = "Abierto";
                } else {
                    estado = "Cerrado";
                }
                
                if("1".equals(temp.getRefrigeracion())){
                    refrigeracion = "Necesaria";
                } else {
                    refrigeracion = "No Necesaria";
                }
 
                Subasta_Transporte subTrans = new Subasta_Transporte(temp.getIdSubasta(),temp.getFechaInicio(),temp.getFechaFin(),temp.getCapacidadCarga(),temp.getTamanoCarga(),refrigeracion,estado);
                
                SolicSubastas.add(subTrans);
        }
        
        request.setAttribute("subastas", SolicSubastas);
        request.getRequestDispatcher("listarSubastas.jsp").forward(request, response);
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

    private String getAllSubTransporte() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        org.tempuri.IOpenServices port = service.getBasicHttpBindingIOpenServices();
        return port.getAllSubTransporte();
    }


}