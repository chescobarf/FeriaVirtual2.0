/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibreriaClases;

import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author AlexanderArevalo
 */
public class Login {
    String Password;
    String Estado;
    int Usuario;

    public Login(String Password, String Estado, int Usuario) {
        this.Password = Password;
        this.Estado = Estado;
        this.Usuario = Usuario;
    }
    
    public Login() {
        this.Init();
    }

    private void Init() {
        this.Password = "";
        this.Estado = "";
        this.Usuario = 0;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public int getUsuario() {
        return Usuario;
    }

    public void setUsuario(int Usuario) {
        this.Usuario = Usuario;
    }

}
