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
public class OfertaProducto {
    
    int IdFruta;
    int OfertaProcesoVentaId;
    double cantidad;
    int costo;

    public OfertaProducto(int IdFruta, int OfertaProcesoVentaId, double cantidad, int costo) {
        this.IdFruta = IdFruta;
        this.OfertaProcesoVentaId = OfertaProcesoVentaId;
        this.cantidad = cantidad;
        this.costo = costo;
    }

    public int getIdFruta() {
        return IdFruta;
    }

    public void setIdFruta(int IdFruta) {
        this.IdFruta = IdFruta;
    }

    public int getOfertaProcesoVentaId() {
        return OfertaProcesoVentaId;
    }

    public void setOfertaProcesoVentaId(int OfertaProcesoVentaId) {
        this.OfertaProcesoVentaId = OfertaProcesoVentaId;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "OfertaProducto{" + "IdFruta=" + IdFruta + ", OfertaProcesoVentaId=" + OfertaProcesoVentaId + ", cantidad=" + cantidad + ", costo=" + costo + '}';
    }
    
    
}
