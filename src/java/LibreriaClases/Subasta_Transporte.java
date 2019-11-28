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
public class Subasta_Transporte {
    
    int IdSubasta;
    String FechaInicio;
    String FechaFin;
    int CapacidadCarga;
    int TamanoCarga;
    String Refrigeracion;
    String Estado;

    public Subasta_Transporte() {
        this.IdSubasta = 0;
        this.FechaInicio = "";
        this.FechaFin = "";
        this.CapacidadCarga = 0;
        this.Refrigeracion = "";
        this.Estado = "";
    }

    public Subasta_Transporte(int IdSubasta, String FechaInicio, String FechaFin, int CapacidadCarga, int TamanoCarga, String Refrigeracion, String Estado) {
        this.IdSubasta = IdSubasta;
        this.FechaInicio = FechaInicio;
        this.FechaFin = FechaFin;
        this.CapacidadCarga = CapacidadCarga;
        this.TamanoCarga = TamanoCarga;
        this.Refrigeracion = Refrigeracion;
        this.Estado = Estado;
    }

    public int getIdSubasta() {
        return IdSubasta;
    }

    public void setIdSubasta(int IdSubasta) {
        this.IdSubasta = IdSubasta;
    }

    public String getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(String FechaInicio) {
        this.FechaInicio = FechaInicio;
    }

    public String getFechaFin() {
        return FechaFin;
    }

    public void setFechaFin(String FechaFin) {
        this.FechaFin = FechaFin;
    }

    public int getCapacidadCarga() {
        return CapacidadCarga;
    }

    public void setCapacidadCarga(int CapacidadCarga) {
        this.CapacidadCarga = CapacidadCarga;
    }

    public int getTamanoCarga() {
        return TamanoCarga;
    }

    public void setTamanoCarga(int TamanoCarga) {
        this.TamanoCarga = TamanoCarga;
    }

    public String getRefrigeracion() {
//        if("1".equals(Refrigeracion)){
//            return "Necesaria";
//        }else{
//            return "No necesita";
//        }
        return Refrigeracion;
    }

    public void setRefrigeracion(String Refrigeracion) {
        this.Refrigeracion = Refrigeracion;
    }

    public String getEstado() {
//        if("1".equals(Estado)){
//            return "Abierto";
//        }else{
//            return "Cerrado";
//        }
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    
}
