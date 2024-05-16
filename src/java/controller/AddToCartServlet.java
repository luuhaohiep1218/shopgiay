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
import java.util.List;
import model.Account;
import dal.AccountDAO;
import model.Cart;
import dal.CartDAO;
import model.Categories;
import dal.CategoriesDAO;
import model.Products;
import dal.ProductsDAO;

/**
 *
 * @author admin
 */
@WebServlet(name="AddToCartServlet", urlPatterns={"/addtocart"})
public class AddToCartServlet extends HttpServlet {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        long t = 0;
        ProductsDAO daop=new ProductsDAO();
        AccountDAO daoa=new AccountDAO();
        CartDAO daoc=new CartDAO();
        CategoriesDAO daoC = new CategoriesDAO();
        List<Categories> listC = daoC.getAllCategories();
        HttpSession session = request.getSession();
        Account a = (Account) session.getAttribute("acc");
        
        if(a!=null){
            List<Cart> list = daoc.getCart(a.getAccount_Id());
            for (Cart i : list) {
                t += i.getQuantity() * i.getProduct_Id().getpPrice();
            }
            
            request.setAttribute("listCart", list);
            request.setAttribute("listC", listC);
            request.setAttribute("t", t);
            request.getRequestDispatcher("shoping-cart.jsp").forward(request, response);
        }else {
            response.sendRedirect("login.jsp");
        }
        
    } 

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
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
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
