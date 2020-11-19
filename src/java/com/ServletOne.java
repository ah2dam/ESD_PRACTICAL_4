/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Triangle;

/**
 *
 * @author zZMerciZz
 */
public class ServletOne extends HttpServlet {

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
        int numberList[] = {1,2,3,4,5,6,7,8,9,10};
        Random rdn = new Random();
//        int a = numberList[rdn.nextInt(numberList.length)];
//        int b = numberList[rdn.nextInt(numberList.length)];
//        int c = numberList[rdn.nextInt(numberList.length)];
        
        String sd1 = request.getParameter("side1");
        String sd2 = request.getParameter("side2");
        String sd3 = request.getParameter("side3");
        
        int a = Integer.parseInt(sd1);
        int b = Integer.parseInt(sd2);
        int c = Integer.parseInt(sd3);
        
        Triangle triangle = new Triangle(a, b, c);
        request.setAttribute("msg",triangle.evalTriangle());
        request.setAttribute("nums","The number are: " + a + " " + b + " " + c + "<br>" );
        
        RequestDispatcher rd = request.getRequestDispatcher("/viewer/TriView.jsp");
        rd.forward(request, response);
        
        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet ServletOne</title>");
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet ServletOne at " + request.getContextPath() + "</h1>");
//            out.println("Hello this is my first application <br>");
//            //Histogram
//
//            //Triangle
//            out.println("The number are: " + a + " " + b + " " + c + "<br>");
//            out.println("Result: " + triangle.evalTriangle()+ "<br>");
//            out.println("<h2>OS: " + System.getProperty("os.name") + "<h2>");
//            out.println("<h2>Computer user name: " + System.getenv("USERNAME") + "<h2>");
//            out.println("</body>");
//            out.println("</html>");
//        }
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
