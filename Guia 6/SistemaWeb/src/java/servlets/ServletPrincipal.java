
package servlets;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Models.ViewModelEmpleados;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class ServletPrincipal extends HttpServlet {
    private final String usuario = "login_admin_josem";
    private final String contrasenia = "root";
    private final String servidor = "localhost:1433";
    private final String bd ="Farmacia";
    
    String url ="jdbc:sqlserver://"
            + servidor
            +";databaseName=" + bd
            +";user=" + usuario
            +";password=" + contrasenia
            +";encrypt=false;trustServerCertificate=false;";
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletPrincipal</title>");            
            out.println("</head>");
            out.println("<body>");
            
            out.println("<h1>Servlet ServletPrincipal at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    public void mostrarEmpleados(HttpServletRequest request, HttpServletResponse response) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            try(Connection conn = DriverManager.getConnection(url)){
            //try (Connection conn = DriverManager.getConnection(url);) {
                request.setAttribute("mensaje_conexion", "Ok!");
                String sqlQuery = "select * from Empleados";
                PreparedStatement pstmt = conn.prepareStatement(sqlQuery);
                ResultSet rs = pstmt.executeQuery();
                ArrayList<ViewModelEmpleados> listaEmpleados = new ArrayList<>();
                while (rs.next()) {
                    ViewModelEmpleados empleado = new ViewModelEmpleados();
                    empleado.setID_Empleado(rs.getInt("ID_Empleado"));
                    empleado.setNombresEmpleado(rs.getString("nombresEmpleado"));
                    empleado.setApellidosEmpleado(rs.getString("apellidosEmpleado"));
                    empleado.setDUI_Empleado(rs.getString("DUI_Empleado"));
                    empleado.setISSS_Empleado(rs.getString("ISSS_Empleado"));
                    empleado.setFechaNacEmpleado(rs.getDate("fechaNacEmpleado"));
                    empleado.setTelefonoEmpleado(rs.getString("telefonoEmpleado"));
                    empleado.setEmail(rs.getString("email"));
                    empleado.setID_Direccion(rs.getInt("ID_Direccion"));
                    empleado.setID_Cargo(rs.getInt("ID_Cargo"));
                    listaEmpleados.add(empleado);
                }               
                request.setAttribute("listaEmpleados", listaEmpleados);

            }
        } catch (SQLException | ClassNotFoundException ex) {
            request.setAttribute("mensaje_conexion", ex.getMessage());
            ex.printStackTrace();
        }
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion = request.getParameter("accion");
        
        if(accion == null){
            request.getRequestDispatcher("/Login.jsp").forward(request, response);
        } else if(accion.equals("Login")){
            request.getRequestDispatcher("/Login.jsp").forward(request, response);
        } else if(accion.equals("RegistroEmpleados")){
            request.getRequestDispatcher("/RegistroEmpleados.html").forward(request,response);
        } else if(accion.equals("RegistroMedicamentos")){
            request.getRequestDispatcher("/RegistroMedicamentos.html").forward(request,response);
        } else if(accion.equals("RegistroProveedores")){
            request.getRequestDispatcher("/RegistroProveedores.html").forward(request,response);
        } else if(accion.equals("RegistroClientes")){
            request.getRequestDispatcher("/RegistroClientes.html").forward(request,response);
            
        } else if(accion.equals("GestionarEmpleados")){
            mostrarEmpleados(request,response);
            request.getRequestDispatcher("/GestionarEmpleados.jsp").forward(request,response);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion = request.getParameter("accion");
        
        if(accion.equals("Login")){
            String usuario = request.getParameter("tfUsuario");
            String contrasenia = request.getParameter("tfContrasenia");
            
            try(PrintWriter print = response.getWriter()){
                if(usuario.equals("admin") && contrasenia.equals("root")){
                    request.getRequestDispatcher("/PanelAdministrador.jsp").forward(request, response);
                }else{
                    print.println("<!DOCTYPE html>");
                    print.println("<html>");
                    print.println("<head>");
                    print.println("<title>Servlet ServletPrincipal</title>");            
                    print.println("</head>");
                    print.println("<body>");
                    print.println("<h1>ERROR: El usuario o la contraseña son erroneos.</h1>");
                    print.println("</body>");
                    print.println("</html>");
                }
            }
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
