/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibreriaClases;

import java.util.Date;


/**
 *
 * @author gerar
 */
public class Contrato {
    
    int IdContrato;
    Date IniFecha;
    Date FinFecha;
    String AnexoPDF;
    int Usuario;

    public Contrato(int IdContrato, Date IniFecha, Date FinFecha, String AnexoPDF, int Usuario) {
        this.IdContrato = IdContrato;
        this.IniFecha = IniFecha;
        this.FinFecha = FinFecha;
        this.AnexoPDF = AnexoPDF;
        this.Usuario = Usuario;
    }


    public int getIdContrato() {
        return IdContrato;
    }

    public void setIdContrato(int IdContrato) {
        this.IdContrato = IdContrato;
    }

    public Date getIniFecha() {
        return IniFecha;
    }

    public void setIniFecha(Date IniFecha) {
        this.IniFecha = IniFecha;
    }

    public Date getFinFecha() {
        return FinFecha;
    }

    public void setFinFecha(Date FinFecha) {
        this.FinFecha = FinFecha;
    }

    public String getAnexoPDF() {
        return AnexoPDF;
    }

    public void setAnexoPDF(String AnexoPDF) {
        this.AnexoPDF = AnexoPDF;
    }

    public int getUsuario() {
        return Usuario;
    }

    public void setUsuario(int Usuario) {
        this.Usuario = Usuario;
    }

    
}
