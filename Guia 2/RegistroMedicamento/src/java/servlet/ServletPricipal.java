
package servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletPricipal", urlPatterns = {"/ServletPricipal"})
public class ServletPricipal extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletPricipal</title>");  
            out.println("<style>");
            out.println("body {");
            out.println("    font-family: Arial, sans-serif;");
            out.println("    background-color: #f5f5f5;");
            out.println("}");
            out.println(".container {");
            out.println("    width: 80%;");
            out.println("    margin: 0 auto;");
            out.println("    padding: 20px;");
            out.println("    background-color: #fff;");
            out.println("    border: 1px solid #ccc;");
            out.println("    border-radius: 5px;");
            out.println("    box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);");
            out.println("}");
            out.println("h1 {");
            out.println("    background-color: #333;");
            out.println("    color: #fff;");
            out.println("    padding: 10px;");
            out.println("    border-radius: 5px 5px 0 0;");
            out.println("}");
            out.println("strong {");
            out.println("    font-weight: bold;");
            out.println("}");
            out.println("</style>");
            out.println("</head>");
            out.println("<body>");
            out.println("<div class='container'>");
            
            String nombre = request.getParameter("tfNombres");
            String descripcion = request.getParameter("taDescripcion");
            String PrecioUnitario = request.getParameter("tfPrecio");
            String Existencia = request.getParameter("tfExistencia");
            String FechaVencimiento = request.getParameter("dFechaVencimiento");
           
            out.println("<h1>¡Registro Exitoso del Medicamento!</h1>");
            out.println("<h3>Datos Guardados:</h3>");
            out.println("<strong>Nombre: </strong>" + nombre);
            out.println("<br><strong>Desripcion: </strong>" + descripcion);
            out.println("<br><strong>Precio Unitario: </strong>" + PrecioUnitario);
            out.println("<br><strong>Existencia: </strong>" + Existencia);
            out.println("<br><strong>Fecha Vencimiento: </strong>" + FechaVencimiento);
            
            out.println("</div>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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
        processRequest(request, response);
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
