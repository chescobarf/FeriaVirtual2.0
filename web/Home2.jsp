<%-- 
    Document   : Home2
    Created on : 30-sep-2019, 19:11:52
    Author     : gerar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
        <link rel="shortcut icon" type="image/x-icon" href="favicon.ico"/>        
        <link rel="stylesheet" href="assets/css/style.css">
        <link rel="stylesheet" href="assets/css/customHome.css">
        
    </head>
    <body>
        <div class="row">
            <center><div class="col-md-12">
                <br>
                <c:if ${request.getParameter("alert") != null}>
                    <h1>${request.getParameter("alert")}</h1>
                </c:if>
                <h2 class="letra">Bienvenido</h2>
                <br>
                <h2 class="letra">${sessionScope.nombre}</h2>
            </div></center>
        </div>
        <div class="container-fluid">
            <div class="row">
                <div  class="col-2 logologo">
                <img  src="assets/img/account-outline.png" width="120" height="120" alt="Feria Virtual"/>
                </div>
                <div class="col-form-label">
                    <br>
                    <img class="logo" src="assets/img/Logo.PNG" width="200" height="150" alt="Feria Virtual"/>
                </div>
                <br>
            <br><br>
        </div>
        </div>
        <br>
    <div class="metro">
            <div class="l1">
                <li class="item i1">
                    <a href="registroUsuario.jsp"><center><img src="assets/img/account-multiple-plus-outline (1).png" align="center"height="160" width="180"   alt="#" ></center></a>
                    <span>Agregar Usuario</span>             
                </li>
                 <li class="item i2">
                     <a href="crearFruta.jsp"><center><img  src="assets/img/food-apple.png" height="160" width="180" alt="#"></center></a>
                    <span>Crear Fruta</span>
                </li>
                <li class="item i3">
                    <a><center><img src="assets/img/truck.png" height="160" width="180"></center></a>
                    <span>Administrar Transportes</span>
                </li>
            </div>
            
            <div class="l2">
                <li class="item i4">
                    <a href="ProcesoVenta.jsp"><center><img src="assets/img/chart-areaspline.png" height="160" width="180"></center></a>
                    <span>Crear Venta</span>
                </li>
                 <li class="item i5">
                     <a> <center><img src="assets/img/tools.png" height="160" width="180"></center></a>
                    <span>Configuración</span>
                </li>
                <li class="item i6 ">
                    
                    <a href="Contratos.jsp"><center><img src="assets/img/file-document-outline.png" align="middle" height="160" width="160" middle></center> </a>
                    <span>Administrar Contratos</span>
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
