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
        <title>Ingresar Solicitud</title>
        <link rel="shortcut icon" type="image/x-icon" href="favicon.ico"/>
        <link href="assets/css/cssForm.css" rel="stylesheet" id="bootstrap-css">
        <link rel="stylesheet" href="//cdnjs.cloudflare.com/ajax/libs/font-awesome/4.2.0/css/font-awesome.min.css">       
        <link rel="stylesheet" href="assets/css/customHome.css">
        <link rel="stylesheet" href="assets/css/bootstrap.min.css">
    <body>

        <div class="container-fluid">
            <nav class="navbar navbar-expand-lg navbar-light bg-light">
                <a class="navbar-brand" href="#">Feria Virtual</a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>

                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav mr-auto">
                        <li class="nav-item active">
                            <a class="nav-link" href="homeClienteEx.jsp">Inicio<span class="sr-only">(current)</span></a>
                        </li>
                    </ul>
                </div>
            </nav>
        </div>
        <br>

        <h1 class="letra" align="center">Ingresar Solicitud</h1>

        <div class="container">
            <div class="row">
                <div class="col-6">
                    <br><br><br><br><br><br><br><br>
                    <center>
                        <img src="assets/img/Logo.PNG" width="365" height="175" alt="Feria Virtual"/>
                    </center>
                </div>
                <div class="col-1">
                    <div class="lineVert">
                    </div>
                </div>
                <br>
                <div class="column is-5">
                    <article class="message is-info">
                        <div class="message-header ">
                            <h5>Solicitud</h5>
                        </div>
                        <div class="message-body field">
                            <form action="ServletSolVenta" method="post">
                                <div class="columns">
                                    <div class="column">
                                        <label for="nombre" class="label">Descripción:</label>
                                        <textarea name="descripcion" rows="3" cols="25"></textarea>
                                    </div>
                                    <div class="column">
                                        <label for="tipo" class="label">Tipo:</label>
                                        <div class="control">
                                            <select id="pro" name="Tipo" class="form-control">
                                                <option>Seleccione</option>
                                                <option value="Nacional">Nacional</option>
                                                <option value="Internacional">Internacional</option>
                                            </select>  
                                        </div>
                                    </div>
                                </div>
                                <div class="columns">
                                    <div class="column">
                                        <label for="usuario" class="label">Codigo Postal:</label>
                                        <div class="control">
                                            <input type="text" name="txtcodigo" class="input">

                                        </div>
                                    </div>
                                    <div class="column">
                                        <label for="usuario" class="label">Fecha Cierre: </label>
                                        <div class="control">
                                            <input type="date" name="txtfecha" class="input">

                                        </div>
                                    </div>
                                </div>
                                <div class="columns">
                                    <div class="column">
                                        <label for="usuario" class="label">Rut: </label>
                                        <div class="control has-icons-left">
                                            <input type="text" name="txtrut" class="input" oninput="this.value=this.value.replace(/[^0-9]/g,'');" maxlength="8" requiered>
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