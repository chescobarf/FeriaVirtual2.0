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
public class ProcesoVenta {
    
    int IdProcesoVenta;
    String IniFecha;
    String FinFecha;
    String Estado;

    
    public ProcesoVenta(int IdProcesoVenta, String IniFecha, String FinFecha, String Estado) {
        this.IdProcesoVenta = IdProcesoVenta;
        this.IniFecha = IniFecha;
        this.FinFecha = FinFecha;
        this.Estado = Estado;
    }

    public int getIdProcesoVenta() {
        return IdProcesoVenta;
    }

    public void setIdProcesoVenta(int IdProcesoVenta) {
        this.IdProcesoVenta = IdProcesoVenta;
    }

    public String getIniFecha() {
        return IniFecha;
    }

    public void setIniFecha(String IniFecha) {
        this.IniFecha = IniFecha;
    }

    public String getFinFecha() {
        return FinFecha;
    }

    public void setFinFecha(String FinFecha) {
        this.FinFecha = FinFecha;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    
    
}
