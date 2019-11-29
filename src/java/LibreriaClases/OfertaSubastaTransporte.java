/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibreriaClases;

/**
 *
 * @author xCobra
 */
public class OfertaSubastaTransporte {
    
    int IdOferta;
    int Precio;
    int IdSubasta;
    int Persona;

    public OfertaSubastaTransporte(int IdOferta, int Precio, int IdSubasta, int Persona) {
        this.IdOferta = IdOferta;
        this.Precio = Precio;
        this.IdSubasta = IdSubasta;
        this.Persona = Persona;
    }

    public int getIdOferta() {
        return IdOferta;
    }

    public void setIdOferta(int IdOferta) {
        this.IdOferta = IdOferta;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    public int getIdSubasta() {
        return IdSubasta;
    }

    public void setIdSubasta(int IdSubasta) {
        this.IdSubasta = IdSubasta;
    }

    public int getPersona() {
        return Persona;
    }

    public void setPersona(int Persona) {
        this.Persona = Persona;
    }

    
}
