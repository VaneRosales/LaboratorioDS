<%-- 
    Document   : ModificarCliente
    Created on : 28 nov 2023, 20:24:58
    Author     : jvane
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Modificar Cliente</title>
        <style>
        body {
            background-color: #eff5f8;
            font-family: Arial, sans-serif;
            display: flex;
            flex-direction: column;
            align-items: center;
            padding: 20px;
            margin: 0;
        }

        form {
            width: 100%;
            max-width: 400px;
            background-color: #ffffff;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0px 0px 10px 0px rgba(0,0,0,0.1);
            margin: 20px 0;
        }

        h1 {
            color: #009688;
            text-align: center;
            margin-bottom: 20px;
        }

        label {
            display: block;
            margin-bottom: 8px;
            color: #009688;
        }

        input {
            width: 100%;
            padding: 10px;
            margin-bottom: 16px;
            border: 1px solid #ddd;
            border-radius: 4px;
            box-sizing: border-box;
        }

        input[type="date"] {
            padding: 10px;
        }

        input[type="submit"] {
            background-color: #009688;
            color: #fff;
            padding: 12px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            font-size: 16px;
        }

        input[type="submit"]:hover {
            background-color: #00796b;
        }

        a {
            text-decoration: none;
            color: #009688;
            font-weight: bold;
            margin-top: 20px;
        }

        a:hover {
            text-decoration: underline;
        }
    </style>
    </head>
    <body>
        <h1>Modificar Cliente</h1>
        <form method="POST" action="/SistemaWebFarmaceutico/ServletPrincipal?accion=ModificarCliente">
            <div>
                <label>ID Cliente:</label>
                <input type="text" name="ID_Cliente" id="ID_Cliente" value="${param.ID_Cliente}" readonly /><br>
                <label>Nombres:</label>
                <input type="text" name="nombresCliente" id="nombresCliente" value="${param.nombresCliente}" required /><br>
                <label>Apellidos:</label>
                <input type="text" name="apellidosCliente" id="apellidosCliente" value="${param.apellidosCliente}" required /><br>
                <label>DUI:</label>
                <input type="text" name="dUI" id="dUI" value="${param.dUI}" required /><br>
                <label>Teléfono:</label>
                <input type="text" name="telefonoCliente" id="telefonoCliente" value="${param.telefonoCliente}" required /><br>
                <label>Email:</label>
                <input type="email" name="email" id="email" value="${param.email}" required /><br>
                <label>ID Dirección:</label>
                <input type="text" name="ID_Direccion" id="ID_Direccion" value="${param.ID_Direccion}" required /><br><br>
                <input type="submit" value="Modificar" onclick="return confirm('¿Desea modificar el cliente?')" /><br><br> 
            </div>
            <div>
                <a href="/SistemaWebFarmaceutico/?accion=GestionarClientes">Regresar</a><br><br>
            </div>             
        </form>
    </body>
</html>
