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
public class Fruta {
    
    int IdFruta;
    String Descripcion;

    public Fruta() {
        IdFruta=0;
        Descripcion="";
    }

    public Fruta(int IdFruta, String Descripcion) {
        this.IdFruta = IdFruta;
        this.Descripcion = Descripcion;
    }

    
    public int getIdFruta() {
        return IdFruta;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setIdFruta(int IdFruta) {
        this.IdFruta = IdFruta;
    }

    public void setDescripción(String Descripcion) {
        this.Descripcion = Descripcion;
    }
}
