<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : crearFruta
    Created on : 05-sep-2019, 23:49:13
    Author     : gerar
--%>

<%@page import="javax.swing.JOptionPane"%>
<%@page import="javafx.scene.control.Alert"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar Usuario</title>
        <link rel="shortcut icon" type="image/x-icon" href="favicon.ico"/>
        <link href="assets/css/cssForm.css" rel="stylesheet" id="bootstrap-css">
        <link rel="stylesheet" href="//cdnjs.cloudflare.com/ajax/libs/font-awesome/4.2.0/css/font-awesome.min.css">       
        <link rel="stylesheet" href="assets/css/customHome.css">
        <link rel="stylesheet" href="assets/css/bootstrap.min.css">
    <body>
        <div class="row">
            <center><div class="col-md-12">
                <br>
                <h2 class="letra" style="font-style: 'center'">Forma de Pago</h2>
            </div></center>
        </div>
        <div class="container">
            <div class="row">
                <div class="col-6">
                    <br><br><br><br><br><br><br><br>
                    <center>
                        <a href="Home2.jsp"><img src="assets/img/Logo.PNG" width="365" height="175" alt="Feria Virtual"/></a>
                    </center>
                </div>
                <div class="col-1">
                    <div class="lineVert">
                    </div>
                </div>
                <br>
                <div class="column is-5">
                    <br>
                    <br><br><br>
                    <article class="message is-info">
                        <div class="message-header ">
                            <h5>Forma de Pago</h5>
                        </div>
                        <div class="message-body field">
                            <form action="ServletUsuario" method="post">
                                <div class="columns">
                                    <div class="column">
                                        <label for="nombre" class="label">Numero De Cuenta:</label>
                                        <div class="control has-icons-left">
                                            <input type="text" class="input" name="numRut" maxlength="9" oninput="this.value=this.value.replace(/[^0-9]/g,'');" required  >
                                            <span class="icon is-small is-left">
                                                <i class="fa fa-user"></i>
                                            </span>
                                        </div>
                                    </div>
                                    <div class="column">
                                        <label for="nombre" class="label">Rut Cuenta:</label>
                                        <div class="control has-icons-left">
                                            <input type="text" class="input" name="numDv" maxlength="8" oninput="this.value=this.value.replace(/[^0-9]/g,'');" required>
                                            <span class="icon is-small is-left">
                                                <i class="fa fa-user"></i>
                                            </span>
                                        </div>
                                    </div>
                                </div>
                                <div class="columns">
                                    <div class="column">
                                        <label for="usuario" class="label">Entidad Financiera: </label>
                                        <div class="control">
                                            <select id="pro" name="Tipo" class="form-control">
                                                <option>Seleccione</option>
                                                <option value="Banco de Chile">Banco de Chile</option>
                                                <option value="Scotiabank Chile">Scotiabank Chile</option>
                                                <option value="Banco Santander">Banco Santander</option>
                                                <option value="Banco Falabella">Banco Falabella</option>
                                                <option value="Banco Itaú">Banco Itaú</option>
                                                <option value="HSBC Bank">HSBC Bank</option>
                                                <option value="Banco Bilbao Vizcaya Argentaria (BBVA)">Banco Bilbao Vizcaya Argentaria (BBVA)</option>
                                            </select>  
                                        </div>
                                        </div>
                                    <div class="column">
                                        <label for="usuario" class="label">Tipo De Cuenta: </label>
                                        <select id="pro" name="Tipo" class="form-control">
                                                <option>Seleccione</option>
                                                <option value="Cuenta Corriente">Cuenta Corriente</option>
                                                <option value="Cuenta Vista">Cuenta Vista</option>
                                            </select>  
                                    </div>
                                </div>
                                <div class="columns">
                                    <div class="column">
                                        <label for="usuario" class="label">Rut Persona: </label>
                                        <div class="control has-icons-left">
                                            <input value="${sessionScope.usuario}" type="email" name="txtEmail" class="input">
                                            <span class="icon is-small is-left">
                                                <i class="fa fa-user"></i>
                                            </span>
                                        </div>
                                    </div>
                                </div>
                                <input type="submit" class="button is-info" id="save">
                            </form>
                        </div>
                    </article>
                </div>
            </div>
        </div>
        <br><br><br><br><br><br>
        <br><br><br><br><br><br>
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
        <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
        <script src=""></script>
    </body>
</html>
