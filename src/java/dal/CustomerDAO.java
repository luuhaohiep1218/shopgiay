/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.util.ArrayList;
import java.util.List;
import model.Cart;
import model.Categories;
import model.Customers;
import model.Products;

/**
 *
 * @author admin
 */
public class CustomerDAO extends MyDAO {
    public void Insert(String name, String phone, String email,
            String street, String city) {
        xSql = "INSERT INTO [customers]\n"
                + "( [customer_name],phone,email,street,city)\n"
                + "VALUES(?, ?, ?,?,?)";
        try {
            ps = con.prepareStatement(xSql);
            ps.setString(1, name);
            ps.setString(5, city);
            ps.setString(4, street);
            ps.setString(2, phone);
            ps.setString(3, email);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public Customers getIdCustomers(String name,String phone,
            String email,String street,String city) {
        List<Customers> t = new ArrayList<>();
        xSql = "select * from customers\n"
                + "WHERE customer_name=? and \n"
                + "phone=? and email=?\n"
                + "street=? and city=?";
        Customers c = new Customers();
        try {
            ps = con.prepareStatement(xSql);
            ps.setString(1, name);
            ps.setString(2, phone);
            ps.setString(3, email);
            ps.setString(4, street);
            ps.setString(5, city);
            rs = ps.executeQuery();
            if (rs.next()) {
                c.setCustomer_Id(rs.getInt(1));
                c.setCustomer_Name(rs.getString(2));
                c.setCustomer_Phone(rs.getString(3));
                c.setCustomer_Email(rs.getString(4));
                c.setCustomer_Street(rs.getString(5));
                c.setCustomer_City(rs.getString(6));
                
            }
            rs.close();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return c;
    }
    public Customers AddCustomer(String name, String phone, String email, String street,
             String city) {
        try {
            xSql = "INSERT INTO [customers]\n"
                    + "( [customer_name],phone,email,street,city)\n"
                    + "VALUES(?, ?, ?,?,?)";
            ps = con.prepareStatement(xSql,ps.RETURN_GENERATED_KEYS);
            ps.setString(1, name);
            ps.setString(2, phone);
            ps.setString(3, email);
            ps.setString(4, street);
            ps.setString(5, city);
            int rowInsert = ps.executeUpdate();
            if (rowInsert > 0) {
                xSql = "select * from customers WHERE customer_id= @@IDENTITY ";
                ps = con.prepareStatement(xSql);
                rs=ps.executeQuery();
                if (rs.next()) {
                    Customers c = new Customers();
                    c.setCustomer_Id(rs.getInt(1));
                    c.setCustomer_Name(rs.getString(2));
                    c.setCustomer_Phone(rs.getString(3));
                    c.setCustomer_Email(rs.getString(4));
                    c.setCustomer_Street(rs.getString(5));
                    c.setCustomer_City(rs.getString(6));
                    return c;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public void Edit(String id, String name, String phone, String street,
            String city) {
        xSql = "UPDATE [customers]\n"
                + "SET\n"
                + "    [customer_name]=?,\n"
                + "    [phone]=?,\n"
                + "    street=?,city=?\n"
                + "    \n"
                + "WHERE customer_id=?";
        try {
            ps = con.prepareStatement(xSql);
            ps.setString(1, name);
            ps.setString(5, id);
            ps.setString(4, city);
            ps.setString(2, phone);
            ps.setString(3, street);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        CustomerDAO dao = new CustomerDAO();
    }
}
