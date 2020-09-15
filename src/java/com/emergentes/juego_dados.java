/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Usuario
 */
@WebServlet(name = "juego_dados", urlPatterns = {"/juego_dados"})
public class juego_dados extends HttpServlet {

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
            out.println("<title>Servlet juego_dados</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet juego_dados at " + request.getContextPath() + "</h1>");
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
            out.println("<title>Juego con dados</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Simulación de Juego con dados</h1>");

            Random rand = new Random();
            int d1 = rand.nextInt(5) + 1;
            int d2 = rand.nextInt(5) + 1;
            int suma = d1 + d2;
            if (suma == 7 || suma == 11) {
                out.println("Primer Dado = " + d1);
                out.println("<br><br>");
                out.println("Segundo Dado= " + d2);
                out.println("<br><br>");
                out.println("La suma de los dos dados es = " + suma);
                out.println("<h2>Ganaste :D XD!!!!!</h2>");
                 out.println("<h3>Para volver a jugar actuliza el navegador......<h3>");
            } else {
                out.println("Primer Dado =" + d1);
                out.println("<br><br>");
                out.println("Segundo Dado=" + d2);
                out.println("<br><br>");
                out.println("La suma de los dos dados es = " + suma);
                out.println("<h2>Perdiste!!!</h2> Sigue intentadolo..... <h3>:(</h3>");
                out.println("<h3>Para volver a jugar actuliza el navegador......<h3>");
            }
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
