<%-- 
    Document   : Postulaciones
    Created on : 22-oct-2019, 17:55:33
    Author     : xCobra
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Proceso de Subastas - Feria Virtual</title>
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
                    <a href="transportista.jsp"><img class="logo" src="assets/img/Logo.PNG" width="200" height="120" alt="Feria Virtual"/></a>
                </div>
            </div>
            <div class="row justify-content-center" align="center">
                <form action="ingresarProductos.jsp" method="post">
                    <label style="color:#FFF; font-size: 20px;"><b>Proceso de Subasta de Transporte - Activos:</b></label>
                    <table class="table table-bordered table-striped table-light table-hover table-hover" >
                        <thead>
                            <tr>
                                <th>#</th>
                                <th>Fecha Inicio</th>
                                <th>Fecha Fin</th>
                                <th>Capacidad Carga</th>
                                <th>Tamaño Carga</th>
                                <th>Refrigeracion</th>
                                <th>Estado</th>
                                <th>Postular</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:set var="qanto" value="${1}" />
                            <c:forEach var="sub" items="${subastas}">
                            <tr>
                                <td scope="row">${qanto}</td>
                                <c:set var="qanto" value="${qanto + 1}" />
                                <td>${sub.getFechaInicio()}</td>
                                <td>${sub.getFechaFin()}</td>
                                <c:set var="capacidadCarga" value="${sub.getCapacidadCarga()}"/>
                                <c:choose>
                                    <c:when test="${capacidadCarga < 10}">
                                        <td>${sub.getCapacidadCarga()} Kilo</td>
                                    </c:when>
                                    <c:when test="${capacidadCarga >=10}">
                                        <td>${sub.getCapacidadCarga()} Kilos</td>
                                    </c:when>
                                    <c:when test="${capacidadCarga}>=1000">
                                        <c:set var="tonelada" value="${sub.getRefrigeracion()/1000}"/>
                                        <td>${tonelada()} Toneladas</td>
                                    </c:when>
                                    <c:otherwise>
                                        <td>No especifica</td>
                                    </c:otherwise>
                                </c:choose>
                                <c:set var="tamanoCarga" value="${sub.getTamanoCarga()}"/>
                                <c:choose>
                                    <c:when test="${tamanoCarga >1}">
                                        <td>${sub.getTamanoCarga()} Cajas</td>
                                    </c:when>
                                    <c:when test="${tamanoCarga <1}">
                                        <td>${sub.getTamanoCarga()} Caja</td>
                                    </c:when>
                                    <c:otherwise>
                                        <td>No especifica</td>
                                    </c:otherwise>
                                </c:choose>
                                
                                <c:set var="refrigeracion" value="${sub.getRefrigeracion()}"/>
                                <c:set var="estado" value="${sub.getEstado()}"/>
                                <c:set var="1" value="${1}"/>
                                <c:set var="0" value="${0}"/>
                                <c:choose>
                                    <c:when test="${refrigeracion == 1}">
                                        <td>Necesaria</td>
                                    </c:when>
                                    <c:when test="${refrigeracion == 0}">
                                        <td>Innesaria</td>
                                    </c:when>
                                    <c:otherwise>
                                        <td>No especifica</td>
                                    </c:otherwise>
                                </c:choose>
                                <c:choose>
                                    <c:when test="${estado == 1}">
                                        <td>Activo</td>
                                    </c:when>
                                    <c:otherwise>
                                        <td>Inactivo</td>
                                    </c:otherwise>
                                </c:choose>
                                <td><center><span class="btn btn-success"</span>Postular</a></center></td>
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
