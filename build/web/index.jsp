<%-- 
    Document   : ind
    Created on : sep 3, 2019, 10:37:53 p.m.
    Author     : AlexanderArevalo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Inicio Sesión - Feria Virtual</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="shortcut icon" type="image/x-icon" href="favicon.ico"/>
        <link rel="stylesheet" href="assets/css/bootstrap.min.css">
        <link rel="stylesheet" href="assets/css/customIndex.css">
    </head>
    <body>
        <div class="container">
            <div class="row">
                <div class="col-6" style="margin-top: 200px;">
                    <center>
                        <img src="assets/img/Logo.PNG" width="365" height="175" alt="Feria Virtual"/>
                    </center>
                </div>
                <div class="col-1" style="margin-top: 100px;">
                    <div class="lineVert">
                    </div>
                </div>
                <div class="col-5" align="center" style="margin-top: 210px;">
                    <div class="myAlert-top alert alert-danger" style="margin-left: -150px;width: 100%">
                        <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
                        <strong>¡Error!</strong> ¡Usuario ó contraseña incorrecta!
                    </div>
                    <form action="ServletLogin" method="POST">
                        <label style="color:#FFF; font-size: 30px; margin-left: -120px"><b>Inicio de sesión</b></label>
                        <div class="form-group row">
                            <div class="col-2"><img src="assets/img/account-card-details.png"/></div>
                            <div>
                                <input type="text" name="txtUser" value="" maxlength="8" oninput="this.value=this.value.replace(/[^0-9]/g,'');"  class="form-control" placeholder="Usuario" required />
                            </div>
                        </div>
                        <div class="form-group row">
                            <div class="col-2"><img src="assets/img/key-outline.png"/></div>
                            <div>
                                <input type="password" name="txtPass" value="" class="form-control" placeholder="Contraseña" required/>
                            </div>
                        </div>
                        <div class="form-group row">
                            <div class="col-3"></div>
                            <div>
                                <input type="submit" value="¡Iniciar!" class="btn btn-success" style="width:100px" />  
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
        <script src="assets/js/custom.js"></script>
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
        <% if (request.getParameter("status") != null) { %>
        <script>
            $(document).ready(function() {
                myAlertTop();
            });
        </script>
        <% }%>
    </body>
</html>
