<%-- 
    Document   : ListarContratos
    Created on : 11-oct-2019, 1:39:10
    Author     : gerar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="shortcut icon" type="image/x-icon" href="favicon.ico"/>
        <link rel="stylesheet" href="assets/css/customHome.css">
        <link rel="stylesheet" href="assets/css/bootstrap.min.css">
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
                            <a class="nav-link" href="Home2.jsp">Inicio<span class="sr-only">(current)</span></a>
                        </li>
                    </ul>
                </div>
            </nav>
        </div>
        <br><br>
        <h1 class="letra" align="center">Lista de Contratos</h1>
        <br><br>
        <div class="container">
            <div align="center">
                <table class="table table-bordered table-striped table-light" >
                    <thead align="center">
                        <tr >
                            <th scope="col">Id Contrato</th>
                            <th scope="col">Fecha Inicio</th>
                            <th scope="col">Fecha Fin</th>
                            <th scope="col">Anexo PDF</th>
                            <th scope="col">Rut Usuario</th>
                            <th scope="col">Editar</th>
                            <th scope="col">Eliminar</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td><input type="submit" value="Editar" name="btneditar" /></td>
                            <td><input type="submit" value="Eliminar" name="btneliminar" /></td>
                        </tr>
                        <tr>
                    </tbody>
                </table>
            </div>
        </div>
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    </body>
</html>
