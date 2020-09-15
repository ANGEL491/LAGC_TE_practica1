/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
@WebServlet(name = "calculadora", urlPatterns = {"/calculadora"})
public class calculadora extends HttpServlet {

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
            out.println("<title>Servlet calculadora</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet calculadora at " + request.getContextPath() + "</h1>");
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
            out.println("<title>Servlet fecha nacimiento</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Calculadora</h1>");
            out.println("<br><br>");
            out.println("<form action ='' method ='post'>");

            out.println("Número : ");
            out.println("<input type='number' name='numero1' required>");
            out.println("<br><br>");

            out.println("Número : ");
            out.println("<input type='number' name='numero2' required>");
            out.println("<br><br>");
            out.println("<input type='submit' value='Procesar'><br><br>");

            out.println("Operación :<select name='operacion' id='cal'>");
            out.println("<option value='1'>Suma</option>");
            out.println("<option value='2'>Resta</option>");
            out.println("<option value='3'>Producto</option>");
            out.println("<option value='4'>División</option>");
            out.println("</select>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");

        } finally {
            out.close();
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

        String numero1 = request.getParameter("numero1");
        String numero2 = request.getParameter("numero2");
        String operacion = request.getParameter("operacion");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        int num1 = Integer.parseInt(numero1);
        int num2 = Integer.parseInt(numero2);
        int ope = Integer.parseInt(operacion);

        try {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Calculadora</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Calculadora</h1>");

            if (numero1 != null && numero2 != null && operacion != null) {
                if (ope == 1) {
                    out.println("La <b>suma</b> es = " + (num1 + num2));
                }
                if (ope == 2) {
                    out.println("La <b>resta</b> es = " + (num1 - num2));
                }
                if (ope == 3) {
                    out.println("El <b>producto</b> es = " + (num1 * num2));
                }
                if (ope == 4) {
                    out.println("La <b>division</b> es = " + (num1 / num2));
                }
            } else {
                out.println("No hay datos para mostrar");
            }

            out.println("</body>");
            out.println("</html>");
        } finally {
            // out.close();
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
