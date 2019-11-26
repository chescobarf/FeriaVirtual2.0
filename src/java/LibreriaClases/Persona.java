/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibreriaClases;

/**
 *
 * @author AlexanderArevalo
 */
public class Persona {
    int Rut;
    String Dv;
    String Nombre;
    String Apellido;
    String Email;
    int Perfil;
    String UrlPhoto;
    
    public Persona(){
        
        Rut = 0;
        Dv = "";
        Nombre = "";
        Apellido = "";
        Email = "";
        Perfil = 0;
        UrlPhoto = "";
    }

    public Persona(int Rut, String Dv, String Nombre, String Apellido, String Email, int Perfil, String UrlPhoto) {
        this.Rut = Rut;
        this.Dv = Dv;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Email = Email;
        this.Perfil = Perfil;
    }

    public int getRut() {
        return Rut;
    }

    public void setRut(int Rut) {
        this.Rut = Rut;
    }

    public String getDv() {
        return Dv;
    }

    public void setDv(String Dv) {
        this.Dv = Dv;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getPerfil() {
        return Perfil;
    }

    public void setPerfil(int Perfil) {
        this.Perfil = Perfil;
    }

    public String getUrlPhoto() {
        return UrlPhoto;
    }

    public void setUrlPhoto(String UrlPhoto) {
        this.UrlPhoto = UrlPhoto;
    }
    
    
    @Override
    public String toString(){
        return "Hola mi nombre es " + Nombre + " " + Apellido + " y mi perfil es: " + Perfil;
    }
}
