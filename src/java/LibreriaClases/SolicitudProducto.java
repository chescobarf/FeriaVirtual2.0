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
public class SolicitudProducto {
    
    int IdFruta;
    int IdProcesoVenta;
    int Cantidad;

    public SolicitudProducto(int IdFruta, int IdProcesoVenta, int Cantidad) {
        this.IdFruta = IdFruta;
        this.IdProcesoVenta = IdProcesoVenta;
        this.Cantidad = Cantidad;
    }

    public int getIdFruta() {
        return IdFruta;
    }

    public void setIdFruta(int IdFruta) {
        this.IdFruta = IdFruta;
    }

    public int getIdProcesoVenta() {
        return IdProcesoVenta;
    }

    public void setIdProcesoVenta(int IdProcesoVenta) {
        this.IdProcesoVenta = IdProcesoVenta;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

}

