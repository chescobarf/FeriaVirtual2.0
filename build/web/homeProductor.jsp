<%-- 
    Document   : Home
    Created on : sep 4, 2019, 10:54:32 a.m.
    Author     : AlexanderArevalo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns:h="http://xmlns.jcp.org/jsf/html" xmlns:f="http://xmlns.jcp.org/jsf/core">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Principal Productor - Feria Virtual</title>
        <link rel="shortcut icon" type="image/x-icon" href="favicon.ico"/>
        <link rel="stylesheet" href="assets/css/style.css">
        <link rel="stylesheet" href="assets/css/bootstrap.min.css">
        <link rel="stylesheet" href="assets/css/customHome.css">
    </head>  
    <body>
        <div class="container">
            <div class="row">
                <div class="col-6" style="margin-left: -100px; margin-top: 1%;">
                    <img src="assets/img/account-outline.png" width="120" height="120" alt="${sessionScope.nombre}"/>
                    <label style="color:#FFF; font-size: 20px;"><b>${sessionScope.nombre}</b></label>
                </div>
                <div class="col-6">
                    <a href="homeProductor.jsp"><img class="logo" src="assets/img/Logo.PNG" width="200" height="120" alt="Feria Virtual"/></a>
                </div>
            </div>
            <div class="row metro">
                <li class="item i1">
                    <a href="ListaProVenta"><center><img src="assets/img/file-document-outline.png" height="160" width="180" alt="#"></center></a>
                    <span>Procesos de Venta</span>
                </li>
                <li class="item i3">
                    <a href="#"><center><img src="assets/img/tools.png" height="160" width="180" alt="#"></center></a>
                    <span>Configuración</span>
                </li>
                <li class="item i8">
                    <a href="ServletLogout"><center><img  src="assets/img/logout.png" height="160" width="180" align="left" alt="#"></center></a>
                    <span>Cerrar Sesión</span>
                </li>
            </div> 
        </div>
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    </body>
</html>
