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
            <nav class="navbar navbar-expand-lg navbar-light bg-light">
                <a class="navbar-brand" href="#">Feria Virtual</a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>

                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav mr-auto">
                        <li class="nav-item active">
                            <a class="nav-link" href="homeProductor.jsp">Inicio<span class="sr-only">(current)</span></a>
                        </li>
                    </ul>
                </div>
            </nav>

            <div class="container" align="center">
                <h1 class="letra" >Ingresar Productos</h1>
            </div>
            <br>
            <div class="container">
                <div>
                    <center><img class="item2"  src="assets/img/Logo.PNG" width="200" height="150" alt="Feria Virtual"/></center>
                </div>
            </div>
            <br><br>
            <form method="post" action="ServletSolProducto">
            <div class="container">
                <div align="center">
                    
                        <table class="table table-bordered table-striped table-light" >
                            <thead>
                                <tr>
                                    <th scope="col"><center>Id Proceso</center></th>
                                    <th scope="col"><center>Fecha Inicio</center></th>
                                    <th scope="col"><center>Fecha Fin</center></th>
                            </tr>
                            </thead>
                            <tbody align="center">
                                <tr>
                                    <td><input type="text" id="idproceso" name="idproceso" value="<c:out value="${proventa.idProcesoVenta}"/>"></td>
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
                <select id="pro" name="productos" class="form-control-lg">
                    <option>Seleccione</option>
                    <c:forEach var="frutas" items="${listaDatosFrutas}">
                        <option value="${frutas.getIdFruta()}">${frutas.getDescripcion()}</option>  
                    </c:forEach>   
                </select>          
                    <input type="text" placeholder="Cantidad" name="numCant" maxlength="5" oninput="this.value=this.value.replace(/[^0-9]/g,'');" class="form-control-lg">
                    <button type="submit" name="guardar" id="guardar" class="btn btn-success" >Guardar</button>
                <c:set var="idProducto" value="${proventa.idProcesoVenta}"/>    
            </div>
            
            <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
            <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
            <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
            </center>
            </form>
    </body>
</html>
