<%-- 
    Document   : ingresarProductos
    Created on : 04-oct-2019, 18:58:34
    Author     : gerar
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Feria Virtual - Productos</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link rel="stylesheet" href="assets/css/style.css">
        <link rel="stylesheet" href="assets/css/customHome.css">
    </head>
    <body>

        <div class="container-fluid">
            <div class="container" align="center">
                <h1 class="letra" >Producto - Oferta</h1>
            </div>
            <br>
            <div class="container">
                <div>
                    <center><a href="homeProductor.jsp"><img class="item2"  src="assets/img/Logo.PNG" width="200" height="150" alt="Feria Virtual"/></a></center>
                </div>
            </div>
            <br><br>
            <form method="post" action="ServletSolProducto">
                <div class="container">
                    <div align="center">
                        <table class="table table-bordered table-striped table-light" >
                            <thead>
                                <tr>
                                    <th scope="col"><center>Proceso de Venta Numero</center></th>
                            <th scope="col"><center>Fecha Inicio</center></th>
                            <th scope="col"><center>Fecha Fin</center></th>
                            </tr>
                            </thead>
                            <tbody align="center">
                                <tr>
                                    <td><input type="text" id="idproceso" name="idproceso" readonly="readonly" value="<c:out value="${proventa.idProcesoVenta}"/>"></td>
                                    <td><c:out value="${proventa.iniFecha}"/></td>
                                    <td><c:out value="${proventa.finFecha}"/></td>
                                </tr>
                            </tbody>
                        </table>
                    </div>
                    <center><h1 class="letra">Productos</h1></center> 
                    <br>                         
                </div>
                <center>
                    <div class="container">              
                        <!--<select id="pro" name="productos" class="form-control-lg">
                            <option>Seleccione</option>
                        <c:forEach var="frutas" items="${listaDatosFrutas}">
                            <option value="${frutas.getIdFruta()}">${frutas.getDescripcion()}</option>  
                        </c:forEach>
                    </select>-->
                        <input value="${sessionScope.usuario}" type="text" name="rut" class="input" oninput="this.value=this.value.replace(/[^0-9]/g,'');" maxlength="8" style="visibility:hidden" requiered>
                        <input type="text" placeholder="Costo" name="numcosto" maxlength="5" oninput="this.value=this.value.replace(/[^0-9]/g,'');" class="form-control-lg">
                        <select name="calidad" class="form-control-lg">
                            <option value="Alta">Alta</option>
                            <option value="Baja">Baja</option>
                            <option value="Moderada">Moderada</option>
                            <option value="Destacada">Destacada</option>
                        </select>
                        <button type="submit" name="guardar" id="guardar" class="btn btn-success" >Guardar</button>
                        <c:set var="idProducto" value="${proventa.idProcesoVenta}"/>    
                    </div>
                </center>
            </form>
        </div>
    </body>
</html>
