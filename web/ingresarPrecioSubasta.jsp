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
                    <label style="color:#FFF; font-size: 20px;"><b>Proceso de Subasta de Transporte - Seleccionada:</b></label>
                    <div class="card" style="width: 35rem;">
                        <div class="card-body">
                          <h5 class="card-title">Subasta Transporte</h5>
                          <p class="card-text">Estas apunto de ofertar el valor a cobrar para participar dentro de esta subasta, recuerda revisar siempre los detalles.</p>
                        </div>
                        <ul class="list-group list-group-flush">
                          <li class="list-group-item">Fecha de inicio de esta subasta: ${subasta.getFechaInicio()}</li>
                          <li class="list-group-item">Fecha de fin de esta subasta: ${subasta.getFechaFin()}</li>
                          <c:set var="capacidadCarga" value="${subasta.getCapacidadCarga()}"/>
                                    <c:choose>
                                        <c:when test="${capacidadCarga < 10}">
                                            <li class="list-group-item">Capacidad de carga ${subasta.getCapacidadCarga()} Kilo</li>
                                        </c:when>
                                        <c:when test="${capacidadCarga >=10}">
                                            <li class="list-group-item">Capacidad de carga ${subasta.getCapacidadCarga()} Kilos</li>
                                        </c:when>
                                        <c:when test="${capacidadCarga}>=1000">
                                            <c:set var="tonelada" value="${subasta.getCapacidadCarga()/1000}"/>
                                            <li class="list-group-item">Capacidad de carga ${tonelada()} Toneladas</li>
                                        </c:when>
                                        <c:otherwise>
                                            <li class="list-group-item">Capacidad De Carga No Especificado</li>
                                        </c:otherwise>
                                    </c:choose>
                                    <c:set var="tamanoCarga" value="${subasta.getTamanoCarga()}"/>
                                    <c:choose>
                                        <c:when test="${tamanoCarga >1}">
                                            <li class="list-group-item">Tamaño de carga ${subasta.getTamanoCarga()} Cajas</li>
                                        </c:when>
                                        <c:when test="${tamanoCarga <1}">
                                            <li class="list-group-item">Tamaño de carga ${subasta.getTamanoCarga()} Caja</li>
                                        </c:when>
                                        <c:otherwise>
                                        <li class="list-group-item">Tamaño Carga No Especificado</li>
                                        </c:otherwise>
                                    </c:choose>

                                    <c:set var="refrigeracion" value="${subasta.getRefrigeracion()}"/>
                                    <c:set var="estado" value="${subasta.getEstado()}"/>
                                    <c:set var="1" value="${1}"/>
                                    <c:set var="0" value="${0}"/>
                                    <c:choose>
                                        <c:when test="${refrigeracion == 1}">
                                            <li class="list-group-item">Refrigeracion Necesaria</li>
                                        </c:when>
                                        <c:when test="${refrigeracion == 0}">
                                            <li class="list-group-item">No necesita Refrigeracion</li>
                                        </c:when>
                                        <c:otherwise>
                                            <li class="list-group-item">Refrigeracion No Especificada</li>
                                        </c:otherwise>
                                    </c:choose>
                        </ul>
                        <div class="card-body">
                          <h4>Precio a ofertar</h4>
                          <input type="number" class="form-control mb-2 mr-sm-2" name="numero" id="numero" min="990" max="9999999" placeholder="$ Cantidad en pesos">
                          <a href="#" class="btn btn-success">Ofertar</a>
                        </div>
                    </div> 
                </form>
            </div>          
        </div>    
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    </body>
</html>
