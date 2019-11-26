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
    <br>
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
    <div align="center">
        <table class="table table-bordered table-striped table-light" >
            <thead>
                <tr>
                    <th scope="col">#</th>
                    <th>Rut</th>
                    <th>Dv</th>
                    <th>Nombre</th>
                    <th>Apellido</th>
                    <th>Email</th>
                    <th>Id Perfil</th>
                    <th>Editar</th>
                    <th>Eliminar</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <th scope="row">1</th>
                    <td>11223344</td>
                    <td>5</td>
                    <td>Administrador</td>
                    <td>Desarrollador</td>
                    <td>admin@mail.com</td>
                    <td>1</td>
                    <td><input type="submit" value="Editar" name="btneditar" /></td>
                    <td><input type="submit" value="Eliminar" name="btneliminar" /></td>
                </tr>
                <tr>
                    <th scope="row">2</th>
                    <td>25514709</td>
                    <td>9</td>
                    <td>Gerardo</td>
                    <td>Vega</td>
                    <td>gera@mail.com</td>
                    <td>2</td>
                    <td><input type="submit" value="Editar" name="btneditar" /></td>
                    <td><input type="submit" value="Eliminar" name="btneliminar" /></td>
                </tr>
            </tbody>
        </table>
        <div align="center">
            <form action="Home2.jsp" method="post">
                <input type="submit" value="Inicio" class="btn btn-success" style="width:130px" /> 
            </form>
        </div>
    </div>    
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</body>
</html>

