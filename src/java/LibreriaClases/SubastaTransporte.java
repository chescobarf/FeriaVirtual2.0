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
public class SubastaTransporte {
    
    int IdOferta;
    int Costo;
    String CalidadFruta;
    int ProductorRut;
    int ProcesoVentaId;

    public SubastaTransporte() {
    }

    public SubastaTransporte(int IdOferta, int Costo, String CalidadFruta, int ProductorRut, int ProcesoVentaId) {
        this.IdOferta = IdOferta;
        this.Costo = Costo;
        this.CalidadFruta = CalidadFruta;
        this.ProductorRut = ProductorRut;
        this.ProcesoVentaId = ProcesoVentaId;
    }

    public int getIdOferta() {
        return IdOferta;
    }

    public void setIdOferta(int IdOferta) {
        this.IdOferta = IdOferta;
    }

    public int getCosto() {
        return Costo;
    }

    public void setCosto(int Costo) {
        this.Costo = Costo;
    }

    public String getCalidadFruta() {
        return CalidadFruta;
    }

    public void setCalidadFruta(String CalidadFruta) {
        this.CalidadFruta = CalidadFruta;
    }

    public int getProductorRut() {
        return ProductorRut;
    }

    public void setProductorRut(int ProductorRut) {
        this.ProductorRut = ProductorRut;
    }

    public int getProcesoVentaId() {
        return ProcesoVentaId;
    }

    public void setProcesoVentaId(int ProcesoVentaId) {
        this.ProcesoVentaId = ProcesoVentaId;
    }

    @Override
    public String toString() {
        return "SubastaTransporte{" + "IdOferta=" + IdOferta + ", Costo=" + Costo + ", CalidadFruta=" + CalidadFruta + ", ProductorRut=" + ProductorRut + ", ProcesoVentaId=" + ProcesoVentaId + '}';
    }
    
    
}
