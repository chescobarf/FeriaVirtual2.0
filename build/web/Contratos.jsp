<%-- 
    Document   : Contratos
    Created on : 11-oct-2019, 0:44:20
    Author     : gerar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Contratos</title>
        <link rel="shortcut icon" type="image/x-icon" href="favicon.ico"/>
        <link href="assets/css/cssForm.css" rel="stylesheet" id="bootstrap-css">
        <link rel="stylesheet" href="//cdnjs.cloudflare.com/ajax/libs/font-awesome/4.2.0/css/font-awesome.min.css">       
        <link rel="stylesheet" href="assets/css/customHome.css">
        <link rel="stylesheet" href="assets/css/bootstrap.min.css">
    </head>
    <body>
        <div class="row">
            <center><div class="col-md-12">
                <br>
                <h2 class="letra" style="font-style: 'center'">Administración de Contratos</h2>
            </div></center>
        </div>
        <br><br>
        <br>
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
                    <article class="message is-info">
                        <div class="message-header ">
                            <h5>Ingresar Contrato</h5>
                            <br><br><br>
                        </div>
                        <div class="message-body field">
                            <form action="ServletContrato" method="post">
                                <div class="columns">
                                    <div class="column">
                                        <label for="nombre" class="label">Fecha Inicio:</label>
                                        <div class="control has-icons-left">
                                            <input type="date" class="input" name="feini" maxlength="10" required  >
                                            <span class="icon is-small is-left">
                                                <i class="fa fa-user"></i>
                                            </span>
                                        </div>
                                    </div>
                                </div>
                                <div class="columns">
                                    <div class="column">
                                        <label for="nombre" class="label">Fecha Fin:</label>
                                        <div class="control has-icons-left">
                                            <input type="date" class="input" name="fefin" maxlength="10" required  >
                                            <span class="icon is-small is-left">
                                                <i class="fa fa-user"></i>
                                            </span>
                                        </div>
                                    </div>
                                </div>
                                <div class="columns">
                                    <div class="column">
                                        <label for="usuario" class="label">Anexo PDF: </label>
                                        <div class="control has-icons-left">
                                            <input type="text" name="txtPdf" class="input">
                                            <span class="icon is-small is-left">
                                                <i class="fa fa-user"></i>
                                            </span>
                                        </div>
                                    </div>
                                </div>
                                <div class="columns">
                                    <div class="column">
                                        <label for="usuario" class="label">Rut: </label>
                                        <div class="control has-icons-left">
                                            <input type="number" name="numRut" maxlength="8" class="input">
                                            <span class="icon is-small is-left">
                                                <i class="fa fa-user"></i>
                                            </span>
                                        </div>
                                    </div>
                                </div>
                                <center></center>
                                <input  type="submit" value="Agregar" name="Agregar" class="button is-info" id="save" >
                                <span class="icon letra">
                                    <i class="fa fa-save"></i>
                                </span>

                                <br>
                                <input  type="submit" value="Listar" name="Agregar" class="button is-info" id="save" >
                                <span class="icon letra">
                                    <i class="fa fa-save"></i>
                                </span>

                                <br>
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
