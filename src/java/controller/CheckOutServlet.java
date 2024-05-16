/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package controller;

import dal.CartDAO;
import dal.CategoriesDAO;
import dal.CustomerDAO;
import dal.OrderDAO;
import dal.OrderItemsDAO;
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
import model.Cart;
import model.Categories;
import model.Customers;
import model.Orders;

/**
 *
 * @author admin
 */
@WebServlet(name="CheckOutServlet", urlPatterns={"/checkout"})
public class CheckOutServlet extends HttpServlet {
   
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
        long t = 0 ;
        CategoriesDAO dao = new CategoriesDAO();
        CartDAO daoc = new CartDAO();
        CustomerDAO daocus = new CustomerDAO();
        OrderDAO daoo=new OrderDAO();
        OrderItemsDAO daoot=new OrderItemsDAO();
        HttpSession session = request.getSession();
        Account a = (Account) session.getAttribute("acc");
        String ac = String.valueOf(a.getAccount_Id());
        List<Categories> list = dao.getAllCategories();
        List<Cart> listC = daoc.getCart(a.getAccount_Id());
        request.setAttribute("listCart", listC);
        request.setAttribute("listC", list);
        String name = request.getParameter("cusName");
        String add = request.getParameter("cusAdd");
        String city = request.getParameter("cusCity");
        String phone = request.getParameter("cusPhone");
        String email = request.getParameter("cusEmail");
        String id=request.getParameter("pid");
        
        for (Cart i : listC) {
            t += i.getQuantity() * i.getProduct_Id().getpPrice();
        }
        request.setAttribute("t", t);

        if (name == null || name.trim().length() == 0 || add == null || add.trim().length() == 0
                || city == null || city.trim().length() == 0 || email == null || email.trim().length() == 0) {
            request.setAttribute("err", "Please fill in the space");
            request.getRequestDispatcher("checkout.jsp").forward(request, response);
            return;
        }
        if (phone.trim().length() != 10) {
            request.getRequestDispatcher("checkout.jsp").forward(request, response);
            return;
        }
        Cart cart=daoc.getQuantityById(id, ac);
        if (a != null) {
            Customers cus = daocus.AddCustomer(name, phone, email, add, city);
            Orders ord=daoo.AddOrder(cus.getCustomer_Id(), t);
            for (Cart cart1 : listC) {
                daoot.InsertOrderItems(ord.getOrder_Id(), cart1);
            }
                daoc.DeleteC(ac);
            request.getRequestDispatcher("homepage").forward(request, response);
        } else {
            response.sendRedirect("checkout.jsp");
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
