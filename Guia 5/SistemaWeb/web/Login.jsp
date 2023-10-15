<%-- 
    Document   : Login
    Created on : 7 oct 2023, 09:41:59
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
        <div><h1>Iniciar Sesion</h1></div>
        <div>
            <form method="POST" action="/SistemaWeb/ServletPrincipal?accion=Login"> 
                <div id="resultLogin"></div>
                <div><h1>Bienvenido al Sistema de Farmacia</h1></div><br>
                
                <%-- Comentario en Java --%>
                <%-- Forma antigua e ilegible --%>
                
                <div><label>Fecha actual: <strong><%= new java.util.Date().toString() %></strong></label></div>
                
                <%-- Forma legible--%>
                
                <%
                    java.util.Date fechaActual = new java.util.Date();
                    java.text.SimpleDateFormat sdt = new java.text.SimpleDateFormat("dd/MM/yyyy");
                    String fechaActualLegible = sdt.format (fechaActual);
                %>
                <div><label>Fecha Actual: <strong><%= fechaActualLegible %></strong></label></div>
                <div><label>Usuario:</label></div>
                <div><input type="text" name="tfUsuario"></div>
                <div><label>Contraseña:</label></div>
                <div><input type="password" name="tfContrasenia"></div><br>
                <div><input type="submit" value="Iniciar Sesion"></div>
            </form>
        </div>
    </body>
</html>
