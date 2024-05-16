/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.Cart;
import model.Categories;
import model.Customers;
import model.Orders;
import model.Products;

/**
 *
 * @author admin
 */
public class OrderDAO extends  MyDAO {
    
    public Orders AddOrder(int cusid,long total) {
        LocalDate curDate = java.time.LocalDate.now();
        String date = curDate.toString();
        xSql = "INSERT INTO [orders]\n"
                + "([customer_id],order_date,total)\n"
                + "        VALUES\n"
                + "(?,?,?) ";
        try {
            ps = con.prepareStatement(xSql, ps.RETURN_GENERATED_KEYS);
            ps.setInt(1, cusid);
            ps.setString(2, date);
            ps.setLong(3, total);
            int rowInsert = ps.executeUpdate();
            if (rowInsert > 0) {
                xSql = "select * from orders\n"
                        + "WHERE order_id=@@IDENTITY";
                ps = con.prepareStatement(xSql);
                rs=ps.executeQuery();
                if (rs.next()) {
                    Customers c=new Customers();
                    Orders o=new Orders();
                    o.setOrder_Id(rs.getInt(1));
                    c.setCustomer_Id(rs.getInt(2));
                    o.setCustomer_Id(c);
                    o.setOrder_Date(rs.getDate(3));
                    o.setTotal(rs.getInt(4));
                    return o;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public List<Orders> getOrder() {
        List<Orders> t = new ArrayList<>();
        LocalDate curDate = java.time.LocalDate.now();
        String date = curDate.toString();
        xSql = "SELECT * FROM customers c INNER JOIN orders o \n"
                + "ON c.customer_id=o.customer_id\n"
                + "ORDER BY c.customer_id asc";

        try {
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Customers c=new Customers();
                Orders o=new Orders();
                c.setCustomer_Id(rs.getInt(1));
                c.setCustomer_Name(rs.getString(2));
                c.setCustomer_Phone(rs.getString(3));
                c.setCustomer_Email(rs.getString(4));
                c.setCustomer_Street(rs.getString(5));
                c.setCustomer_City(rs.getString(6));
                o.setOrder_Id(rs.getInt(7));
                o.setCustomer_Id(c);
                o.setOrder_Date(rs.getDate(9));
                o.setTotal(rs.getInt(10));
                t.add(o);
            }
            rs.close();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return t;
    }
    public Orders getProductsByPID(String oid) {
        xSql = "SELECT * FROM customers c INNER JOIN orders o \n"
                + "ON c.customer_id=o.customer_id\n"
                + "WHERE o.order_id=?";

        try {

            ps = con.prepareStatement(xSql);
            ps.setString(1, oid);
            rs = ps.executeQuery();
            while (rs.next()) {
                Customers c = new Customers();
                Orders o = new Orders();
                c.setCustomer_Id(rs.getInt(1));
                c.setCustomer_Name(rs.getString(2));
                c.setCustomer_Phone(rs.getString(3));
                c.setCustomer_Email(rs.getString(4));
                c.setCustomer_Street(rs.getString(5));
                c.setCustomer_City(rs.getString(6));
                o.setOrder_Id(rs.getInt(7));
                o.setCustomer_Id(c);
                o.setOrder_Date(rs.getDate(9));
                o.setTotal(rs.getInt(10));
                return o;
            }
            rs.close();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        OrderDAO dao = new OrderDAO();
//        List<Orders> o=dao.getOrder();
//        for (Orders orders : o) {
//            System.out.println(orders);
//        }
        
        
    }
    
}
