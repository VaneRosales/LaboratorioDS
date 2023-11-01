<%-- 
    Document   : GestionarEmpleados
    Created on : 14 oct 2023, 10:16:14
    Author     : jvane
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gestionar Empleados</title>
    </head>
    <body>
        <h1>Gestión de Empleados</h1>
        <h2>Listado de Empleados</h2>

        <h1>Conexion: ${mensaje_conexion}</h1>

        <table border="1">
            <thead>
                <tr>
                    <th>ID_Empleado</th>
                    <th>NombresEmpleado</th>
                    <th>ApellidosEmpleado</th>
                    <th>DUI_Empleado</th>
                    <th>ISSS_Empleado</th>
                    <th>FechaNacEmpleado</th>
                    <th>TelefonoEmpleado</th>
                    <th>Email</th>
                    <th>ID_Direccion</th>
                    <th>ID_Cargo</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${listaEmpleados}" var="item">
                    <tr>
                        <td><c:out value="${item.ID_Empleado}" /></td>                       
                        <td><c:out value="${item.nombresEmpleado}" /></td>
                        <td><c:out value="${item.apellidosEmpleado}" /></td>
                        <td><c:out value="${item.DUI_Empleado}" /></td>
                        <td><c:out value="${item.ISSS_Empleado}" /></td> 
                        <td><c:out value="${item.fechaNacEmpleado}" /></td>
                        <td><c:out value="${item.telefonoEmpleado}" /></td>
                        <td><c:out value="${item.email}" /></td>                        
                        <td><c:out value="${item.ID_Direccion}" /></td>
                        <td><c:out value="${item.ID_Cargo}" /></td>
                    </tr>
                </c:forEach>
            </tbody>            
        </table>
    </body>
</html>
