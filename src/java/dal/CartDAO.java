/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import model.Account;
import model.Cart;
import model.Categories;
import model.Products;
import model.Size;

/**
 *
 * @author admin
 */
public class CartDAO extends MyDAO {
    public List<Cart> getAllCart() {
        List<Cart> t = new ArrayList<>();
        xSql = "select * from cart";
        try {
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Categories ct = new Categories();
                Cart c = new Cart();
                Account a = new Account();
                Products p = new Products();
                c.setCart_Id(rs.getInt(1));
                p.setpId(rs.getInt(2));
                c.setProduct_Id(p);
                a.setAccount_Id(rs.getInt(3));
                c.setAccount_Id(a);
                c.setQuantity(rs.getInt(4));
                t.add(c);
            }
            rs.close();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (t);
    }
    public Cart getQuantityById(String pid,String aid){
        List<Cart> t = new ArrayList<>();
        xSql = "select * from cart\n"
                + "WHERE product_id=? and account_id=?";
        try {
            ps = con.prepareStatement(xSql);
            ps.setString(1, pid);
            ps.setString(2, aid);
            rs = ps.executeQuery();
            while (rs.next()) {
                Size s=new Size();
                Products p = new Products();
                Account a=new Account();
                Cart c=new Cart();
                c.setCart_Id(rs.getInt(1));
                p.setpId(rs.getInt(2));
                c.setProduct_Id(p);
                a.setAccount_Id(rs.getInt(3));
                c.setAccount_Id(a);
                c.setQuantity(rs.getInt(4));
                s.setSize_Name(rs.getString(5));
                c.setSize(s);
                t.add(c);
                return c;
            }
        } catch (Exception e) {
        }
        return null;
    }
    public Cart getQuantity(String cartid) {
        List<Cart> t = new ArrayList<>();
        xSql = "select * from cart\n"
                + "WHERE cart_id=?";
        try {
            ps = con.prepareStatement(xSql);
            ps.setString(1, cartid);
            rs = ps.executeQuery();
            while (rs.next()) {
                Products p = new Products();
                Account a = new Account();
                Cart c = new Cart();
                c.setCart_Id(rs.getInt(1));
                p.setpId(rs.getInt(2));
                c.setProduct_Id(p);
                a.setAccount_Id(rs.getInt(3));
                c.setAccount_Id(a);
                c.setQuantity(rs.getInt(4));
                t.add(c);
                return c;
            }
        } catch (Exception e) {
        }
        return null;
    }
    public Cart getCartByPID(String pid) {
        List<Cart> t = new ArrayList<>();
        xSql = "SELECT * from cart\n"
                + "WHERE product_id=1";
        try {
            ps = con.prepareStatement(xSql);
            ps.setString(1, pid);
            rs = ps.executeQuery();
            while (rs.next()) {
                Products p = new Products();
                Account a = new Account();
                Cart c = new Cart();
                c.setCart_Id(rs.getInt(1));
                p.setpId(rs.getInt(2));
                c.setProduct_Id(p);
                a.setAccount_Id(rs.getInt(3));
                c.setAccount_Id(a);
                c.setQuantity(rs.getInt(4));
                t.add(c);
                return c;
            }
        } catch (Exception e) {
        }
        return null;
    }
    public void AddToCart(String pId, String aId,String quantity,String sizeid) {
        xSql = "insert into cart\n"
                + "VALUES(?,?,?,?)";
        try {
            ps = con.prepareStatement(xSql);
            ps.setString(1, pId);
            ps.setString(2, aId);
            ps.setString(3, quantity);
            ps.setString(4, sizeid);
            ps.executeUpdate();
            
        } catch (Exception e) {
        }
    }
    
    public List<Cart> getCart(int account_Id) {
        List<Cart> t = new ArrayList<>();
        xSql = "select * from cart c JOIN products p ON c.product_id=p.product_id\n"
                + "where account_id=? ";
        
        try {
            
            ps = con.prepareStatement(xSql);
            ps.setInt(1, account_Id);
            rs = ps.executeQuery();
            while (rs.next()) {
                Size s=new Size();
                Categories ct = new Categories();
                Cart c = new Cart();
                Account a = new Account();
                Products p = new Products();
                c.setCart_Id(rs.getInt(1));
                p.setpId(rs.getInt(2));
                c.setProduct_Id(p);
                a.setAccount_Id(rs.getInt(3));
                c.setAccount_Id(a);
                c.setQuantity(rs.getInt(4));
                p.setpName(rs.getString(7));
                p.setpDetail(rs.getString(8));
                ct.setCategory_Id(rs.getInt(9));
                p.setCategory_Id(ct);
                p.setpPrice(rs.getInt(10));
                p.setpImage(rs.getString(11));
                p.setpId(rs.getInt(6));
                s.setSize_Name(rs.getString(5));
                c.setSize(s);
                t.add(c);
            }
            rs.close();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return t;
    }
    public void UpdateQuantity(String pid ,String aid,int quantity) {
        xSql = "UPDATE cart\n"
                + "SET\n"
                + "    [quantity]=?\n"
                + "    \n"
                + "WHERE product_id=? and account_id=?";
        try {
            ps = con.prepareStatement(xSql);
            ps.setString(2, pid);
            ps.setInt(1, quantity);
            ps.setString(3, aid);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void DeleteCart(String id) {
        xSql = "DELETE FROM [cart]\n"
                + "WHERE cart_id=?";
        try {
            ps = con.prepareStatement(xSql);
            ps.setString(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public void DeleteC(String aid) {
        xSql = "DELETE FROM [cart]\n"
                + "WHERE account_id=?";
        try {
            ps = con.prepareStatement(xSql);
            ps.setString(1, aid);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public void UpdateQ(String cartid, int quantity) {
        xSql = "UPDATE [cart]\n"
                + "SET\n"
                + "    [quantity]=?\n"
                + "WHERE cart_id=?";
        try {
            ps = con.prepareStatement(xSql);
            ps.setString(2, cartid);
            ps.setInt(1, quantity);
            
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        CartDAO dao = new CartDAO();
        List<Cart> c=dao.getCart(3);
        for (Cart cart : c) {
            System.out.println(c);
        }
    }
}
