<%-- 
    Document   : MenuAdministrador
    Created on : 7 oct 2023, 10:26:49
    Author     : jvane
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <nav>
                <ul>
                    <li><a href="/SistemaWeb">Inicio Sistema de Farmacia</a></li>
                    <li><a href="/SistemaWeb?accion=Login">Login</a></li>
                    <li><a href="/SistemaWeb?accion=RegistroEmpleados">Registro de Empleados</a></li> 
                    <li><a href="/SistemaWeb?accion=RegistroMedicamentos">Registro de Medicamentos</a></li>
                    <li><a href="/SistemaWeb?accion=RegistroProveedores">Registro de Proveedores</a></li>
                    <li><a href="/SistemaWeb?accion=RegistroClientes">Registro de Clientes</a></li>
                </ul>
            </nav>
    </body>
</html>
