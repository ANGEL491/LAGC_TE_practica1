package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Usuario
 */
@WebServlet(name = "Conversion_moneda", urlPatterns = {"/Conversion_moneda"})
public class Conversion_moneda extends HttpServlet {

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
            out.println("<title>Servlet Conversion_moneda</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Conversion_moneda at " + request.getContextPath() + "</h1>");
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
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>conversion de monedas</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Conversion de divisas</h1>");

            out.println("<form action='' method='post'>");
            out.println("Boliviano a Dolar :");
            out.println("<input type='number' name='dolar' required>");
            out.println("<br><br>");
            out.println("Dolar a Boliviano :");
            out.println("<input type='number' name='boliviano' required>");
            out.println("<br><br>");
            out.println("<input type='submit' value=convertir>");
            out.println("</form>");

            out.println("</body>");
            out.println("</html>");
        } finally {
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

        String dolar = request.getParameter("dolar");
        String boliviano = request.getParameter("boliviano");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>CONVERSIÓN</title>");
            out.println("</head>");
            out.println("<body>");
            int d = Integer.parseInt(dolar);
            int b = Integer.parseInt(boliviano);
            out.println("<h1>Conversion de divisas</h1>");
            out.println(dolar + " boliviano = " + d / 6.91 + " <b>dólar estadounidense</b><br>");
            out.println(boliviano + " dólar estadounidense = " + b * 6.91 + " <b>boliviano</b><br>");

            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
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
