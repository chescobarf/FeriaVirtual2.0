<%-- 
    Document   : Postulaciones
    Created on : 04-oct-2019, 17:55:33
    Author     : gerar
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Proceso de Venta - Feria Virtual</title>
        <link rel="stylesheet" href="assets/css/bootstrap.min.css">
        <link rel="stylesheet" href="assets/css/style.css">
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
            <div class="row justify-content-center" align="center">
                <form action="ServletComboBox" method="post">
                    <label style="color:#FFF; font-size: 20px;"><b>Proceso de Venta - Activos:</b></label>
                    <table class="table table-bordered table-striped table-light table-hover table-hover" >
                        <thead>
                            <tr>
                                <th>#</th>
                                <th>Fruta(s)</th>
                                <th>Fecha Inicio</th>
                                <th>Fecha Fin</th>
                                <th>Estado</th>
                                <th>Postular</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:set var="qanto" value="${1}" />
                            <c:forEach var="proventa" items="${frutas}">
                            <tr>
                                <td scope="row">${qanto}</td>
                                <c:set var="qanto" value="${qanto + 1}" />
                                <td>${proventa.getFruta()}</td>
                                <td>${proventa.getIniFecha()}</td>
                                <td>${proventa.getFinFecha()}</td>
                                <td>${proventa.getEstado()}</td>
                                <td><a href="ServletComboBox?idProceso=${proventa.getIdProcesoVenta()}"><center><span class="btn btn-success"</span>Postular</a></center></td>
                            </tr>
                            </c:forEach>                       
                        </tbody>
                    </table>
                </form>
            </div>          
        </div>    
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    </body>
</html>
