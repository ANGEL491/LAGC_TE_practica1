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
@WebServlet(name = "matriz_caracol", urlPatterns = {"/matriz_caracol"})
public class matriz_caracol extends HttpServlet {

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
            out.println("<title>Servlet matriz_caracol</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet matriz_caracol at " + request.getContextPath() + "</h1>");
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
            out.println("<h1>Generar matriz caracol</h1>");

            out.println("<form action='' method='post'>");
            out.println("Tamaño de matriz nxn:");
            out.println("<input type='number' name='tamano' required>");
            out.println("<br><br>");
            out.println("<input type='submit' value=Procesar>");
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

        String tamano = request.getParameter("tamano");
        int tam = Integer.parseInt(tamano);
        int[][] m = new int[tam][tam];
        int a = 0, b = tam - 1, valor = 1;
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>MATRIZ CARACOL</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Conversion de divisas</h1>");
            out.println("<b>MATRIZ CARACOL N= <b>" + tamano);

            for (int j = 0; j < m.length; j++) {

                for (int i = a; i <= b; i++) {
                    m[a][i] = valor;
                    valor = valor + 1;
                }
                for (int i = a + 1; i <= b; i++) {
                    m[i][b] = valor;
                    valor = valor + 1;
                }

                for (int i = b - 1; i >= a; i--) {
                    m[b][i] = valor;
                    valor = valor + 1;
                }

                for (int i = b - 1; i >= a + 1; i--) {
                    m[i][a] = valor;
                    valor = valor + 1;
                }

                a = a + 1;
                b = b - 1;
            }

            out.println("<table border='2' cellspacing='1'>");
            for (int i = 0; i <m.length; i++) {
                
            
            out.println("<tr>");
            for (int j = 0; j <m[i].length; j++) {
                out.println("<td>");
                out.println(m[i][j]);
                out.println("</td>");
            }

            out.println("</tr>");
        }
            out.println("</table>");

            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }

    public static void matriz(int tam) {

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
