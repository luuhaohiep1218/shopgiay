/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.Account;
import dal.CartDAO;
import model.Products;

/**
 *
 * @author admin
 */
@WebServlet(name = "CartServlet", urlPatterns = {"/cart"})
public class CartServlet extends HttpServlet {

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
            out.println("<title>Servlet CartServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CartServlet at " + request.getContextPath() + "</h1>");
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
        response.setContentType("text/html;charset=UTF-8");
        CartDAO dao = new CartDAO();
        HttpSession session = request.getSession();
        Account a = (Account) session.getAttribute("acc");
        String ac = String.valueOf(a.getAccount_Id());
        String pid = request.getParameter("proid");
        String quantity = request.getParameter("quantity");
        String size=request.getParameter("size");
        int pId=Integer.parseInt(pid);
        
        int quan=Integer.parseInt(quantity);
        if (a != null) {
            if (dao.getQuantityById(pid, ac)==null) {
                dao.AddToCart(pid, ac, quantity,size);
                response.sendRedirect("shopgird");
            }else if(dao.getQuantityById(pid, ac) == null &&
                    size.equals(dao.getQuantityById(pid, ac).getSize().getSize_Name())){
                dao.UpdateQuantity(pid, ac, quan + dao.getQuantityById(pid, ac).getQuantity());
                response.sendRedirect("shopgird");
            }else if(pId==dao.getQuantityById(pid, ac).getProduct_Id().getpId() &&
                    size.equals(dao.getQuantityById(pid, ac).getSize().getSize_Name())){
                dao.UpdateQuantity(pid, ac, quan + dao.getQuantityById(pid, ac).getQuantity());
                response.sendRedirect("shopgird");
            }
            else {
                dao.AddToCart(pid, ac, quantity, size);
                response.sendRedirect("shopgird");
            }
        } else {
            response.sendRedirect("login.jsp");
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
