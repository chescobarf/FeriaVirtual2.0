/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibreriaClases;

/**
 *
 * @author gerar
 */
public class SolicitudVenta {
    
    int IdSolicitud;
    String Descripcion;
    String Tipo;
    String CodigoPostal;
    String Estado;
    String FechaCierre;
    int Persona;
    int IdProcesoVenta;

    public SolicitudVenta() {
        this.IdSolicitud = 0;
        this.Descripcion = "";
        this.Tipo = "";
        this.CodigoPostal = "";
        this.Estado = "";
        this.FechaCierre = "";
        this.Persona = 0;
        this.IdProcesoVenta = 0;
    }

    public SolicitudVenta(int IdSolicitud, String Descripción, String Tipo, String CodigoPostal, String Estado, String FechaCierre, int Persona, int IdProcesoVenta) {
        this.IdSolicitud = IdSolicitud;
        this.Descripcion = Descripción;
        this.Tipo = Tipo;
        this.CodigoPostal = CodigoPostal;
        this.Estado = Estado;
        this.FechaCierre = FechaCierre;
        this.Persona = Persona;
        this.IdProcesoVenta = IdProcesoVenta;
    }

    public int getIdSolicitud() {
        return IdSolicitud;
    }

    public void setIdSolicitud(int IdSolicitud) {
        this.IdSolicitud = IdSolicitud;
    }

    public String getDescripción() {
        return Descripcion;
    }

    public void setDescripción(String Descripción) {
        this.Descripcion = Descripción;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getCodigoPostal() {
        return CodigoPostal;
    }

    public void setCodigoPostal(String CodigoPostal) {
        this.CodigoPostal = CodigoPostal;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getFechaCierre() {
        return FechaCierre;
    }

    public void setFechaCierre(String FechaCierre) {
        this.FechaCierre = FechaCierre;
    }

    public int getPersona() {
        return Persona;
    }

    public void setPersona(int Persona) {
        this.Persona = Persona;
    }

    public int getIdProcesoVenta() {
        return IdProcesoVenta;
    }

    public void setIdProcesoVenta(int IdProcesoVenta) {
        this.IdProcesoVenta = IdProcesoVenta;
    }

    @Override
    public String toString() {
        return "SolicitudVenta{" + "IdSolicitud=" + IdSolicitud + ", Descripci\u00f3n=" + Descripcion + ", Tipo=" + Tipo + ", CodigoPostal=" + CodigoPostal + ", Estado=" + Estado + ", FechaCierre=" + FechaCierre + ", Persona=" + Persona + ", IdProcesoVenta=" + IdProcesoVenta + '}';
    }
    
    
}
