<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : listarUsuarios
    Created on : 10-sep-2019, 23:17:54
    Author     : gerar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listar Frutas</title>
    <div class="container-fluid">
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <a class="navbar-brand" href="#">Feria Virtual</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item active">
                        <a class="nav-link" href="Home2.jsp">Inicio<span class="sr-only">(current)</span></a>
                    </li>
                </ul>
            </div>
        </nav>
    </div>

    <div class="container">
        <center>
            <img src="assets/img/Logo.PNG" width="235" height="115">
        </center>
        <br>
    </div>
    <link rel="shortcut icon" type="image/x-icon" href="favicon.ico"/>
    <link rel="stylesheet" href="assets/css/bootstrap.min.css">
    <link rel="stylesheet" href="assets/css/customHome.css">
</head>
<body>



    <h1 class="letra" align="center">Listar Frutas</h1>
    <div class="container">

        <div align="center">
            <table class="table table-bordered table-striped table-light" >
                <thead align="center">
                    <tr>
                        <th scope="col">ID Fruta</th>
                        <th scope="col">Descripción</th>
                        <th scope="col">Editar</th>
                        <th scope="col">Eliminar</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="frutas" items="${listaDatosFrutas}">
                        <tr align="center"> 
                            <td>${frutas.getIdFruta()}</td>
                            <td>${frutas.getDescripcion()}</td>
                            <td><center><input type="submit" value="Editar" name="btneditar" class="btn btn-success" /></center></td>
                            <td><center><input type="submit" value="Eliminar" name="btneliminar" class="btn btn-success" /></center></td>
                        </tr>
                    </c:forEach>   
                </tbody>
            </table>
        </div>
    </div>
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</body>
</html>
