/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Categories;
import model.Products;

/**
 *
 * @author admin
 */
public class ProductsDAO extends MyDAO {
    public List<Products> getAllProducts() {
        List<Products> t = new ArrayList<>();
        xSql = "select * from Products";
        try {
            Categories c = new Categories();
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Products p=new Products();
                p.setpId(rs.getInt(1));
                p.setpName(rs.getString(2));
                p.setpDetail(rs.getString(3));
                p.setpPrice(rs.getInt(5));
                p.setpImage(rs.getString(6));
                c.setCategory_Id(rs.getInt(4));
                p.setCategory_Id(c);
                t.add(p);
            }
            rs.close();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (t);
    }
    public Products getProducts(int pId) {
        List<Products> t = new ArrayList<>();
        xSql = "select * from products WHERE product_id=?";
        Products p = new Products();
        try {
            Categories c = new Categories();
            ps = con.prepareStatement(xSql);
            ps.setInt(1, pId);
            rs = ps.executeQuery();
            if(rs.next()){
                p.setpId(rs.getInt(1));
                p.setpName(rs.getString(2));
                p.setpDetail(rs.getString(3));
                p.setpPrice(rs.getInt(5));
                p.setpImage(rs.getString(6));
                c.setCategory_Id(rs.getInt(4));
                p.setCategory_Id(c);
            }
            rs.close();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return p;
    }
    public List<Products> getProductsMLB() {
        List<Products> t = new ArrayList<>();
        xSql = "select top 2 * from products where list_price=3590000 and category_id=1";
        try {
            Categories c = new Categories();
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Products p = new Products();
                p.setpId(rs.getInt(1));
                p.setpName(rs.getString(2));
                p.setpDetail(rs.getString(3));
                p.setpPrice(rs.getInt(5));
                p.setpImage(rs.getString(6));
                c.setCategory_Id(rs.getInt(4));
                p.setCategory_Id(c);
                t.add(p);
            }
            rs.close();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (t);
    }
    public List<Products> getProductsNike() {
        List<Products> t = new ArrayList<>();
        xSql = "select  * from products where  category_id=2 and "
                + "product_id=13 or product_id=15 or product_id=22 or product_id=19";
        try {
            Categories c = new Categories();
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Products p = new Products();
                p.setpId(rs.getInt(1));
                p.setpName(rs.getString(2));
                p.setpDetail(rs.getString(3));
                p.setpPrice(rs.getInt(5));
                p.setpImage(rs.getString(6));
                c.setCategory_Id(rs.getInt(4));
                p.setCategory_Id(c);
                t.add(p);
            }
            rs.close();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (t);
    }
    public List<Products> getProductsVans() {
        List<Products> t = new ArrayList<>();
        xSql = "select  * from products where  category_id=3 and product_id=34 or "
                + "product_id=36 or product_id=37 ";
        try {
            Categories c = new Categories();
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Products p = new Products();
                p.setpId(rs.getInt(1));
                p.setpName(rs.getString(2));
                p.setpDetail(rs.getString(3));
                p.setpPrice(rs.getInt(5));
                p.setpImage(rs.getString(6));
                c.setCategory_Id(rs.getInt(4));
                p.setCategory_Id(c);
                t.add(p);
            }
            rs.close();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (t);
    }
    public List<Products> getProductsMC() {
        List<Products> t = new ArrayList<>();
        xSql = "select  * from products where  category_id=7 and product_id=62 or product_id=68";
        try {
            Categories c = new Categories();
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Products p = new Products();
                p.setpId(rs.getInt(1));
                p.setpName(rs.getString(2));
                p.setpDetail(rs.getString(3));
                p.setpPrice(rs.getInt(5));
                p.setpImage(rs.getString(6));
                c.setCategory_Id(rs.getInt(4));
                p.setCategory_Id(c);
                t.add(p);
            }
            rs.close();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (t);
    }
    public List<Products> getProductsLatest() {
        List<Products> t = new ArrayList<>();
        xSql = "select  * from products where product_id=9"
                + "or product_id=28 or product_id=31";
        try {
            Categories c = new Categories();
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Products p = new Products();
                p.setpId(rs.getInt(1));
                p.setpName(rs.getString(2));
                p.setpDetail(rs.getString(3));
                p.setpPrice(rs.getInt(5));
                p.setpImage(rs.getString(6));
                c.setCategory_Id(rs.getInt(4));
                p.setCategory_Id(c);
                t.add(p);
            }
            rs.close();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (t);
    }
    public List<Products> getProductsRate() {
        List<Products> t = new ArrayList<>();
        xSql = "select  * from products where product_id=1"
                + "or product_id=12 or product_id=34";
        try {
            Categories c = new Categories();
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Products p = new Products();
                p.setpId(rs.getInt(1));
                p.setpName(rs.getString(2));
                p.setpDetail(rs.getString(3));
                p.setpPrice(rs.getInt(5));
                p.setpImage(rs.getString(6));
                c.setCategory_Id(rs.getInt(4));
                p.setCategory_Id(c);
                t.add(p);
            }
            rs.close();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (t);
    }
    public List<Products> getProductsReview() {
        List<Products> t = new ArrayList<>();
        xSql = "select  * from products where product_id=39"
                + "or product_id=67 or product_id=21";
        try {
            Categories c = new Categories();
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Products p = new Products();
                p.setpId(rs.getInt(1));
                p.setpName(rs.getString(2));
                p.setpDetail(rs.getString(3));
                p.setpPrice(rs.getInt(5));
                p.setpImage(rs.getString(6));
                c.setCategory_Id(rs.getInt(4));
                p.setCategory_Id(c);
                t.add(p);
            }
            rs.close();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (t);
    }
    public List<Products> getProductsByCID( String category_Id) {
        List<Products> t = new ArrayList<>();
        xSql = "select  * from products where category_id=?";
        try {
            Categories c = new Categories();
            ps = con.prepareStatement(xSql);
            ps.setString(1, category_Id);
            rs = ps.executeQuery();
            while (rs.next()) {
                Products p = new Products();
                p.setpId(rs.getInt(1));
                p.setpName(rs.getString(2));
                p.setpDetail(rs.getString(3));
                p.setpPrice(rs.getInt(5));
                p.setpImage(rs.getString(6));
                c.setCategory_Id(rs.getInt(4));
                p.setCategory_Id(c);
                t.add(p);
            }
            rs.close();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (t);
    }
    public Products getProductsByPID(String pId) {
        List<Products> t = new ArrayList<>();
        xSql = "select  * from products where product_id=?";
        
        try {
            Categories c = new Categories();
            
            ps = con.prepareStatement(xSql);
            ps.setString(1, pId);
            rs = ps.executeQuery();
            while (rs.next()) {
                Products p = new Products();
                p.setpId(rs.getInt(1));
                p.setpName(rs.getString(2));
                p.setpDetail(rs.getString(3));
                p.setpPrice(rs.getInt(5));
                p.setpImage(rs.getString(6));
                c.setCategory_Id(rs.getInt(4));
                p.setCategory_Id(c);
                t.add(p);
                return p;
            }
            rs.close();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public List<Products> searchByName(String pName) {
        List<Products> t = new ArrayList<>();
        xSql = "select  * from products where product_name LIKE ?";
        try {
            Categories c = new Categories();
            ps = con.prepareStatement(xSql);
            ps.setString(1, "%"+pName+"%");
            rs = ps.executeQuery();
            while (rs.next()) {
                Products p = new Products();
                p.setpId(rs.getInt(1));
                p.setpName(rs.getString(2));
                p.setpDetail(rs.getString(3));
                p.setpPrice(rs.getInt(5));
                p.setpImage(rs.getString(6));
                c.setCategory_Id(rs.getInt(4));
                p.setCategory_Id(c);
                t.add(p);
            }
            rs.close();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (t);
    }
    public void Delete(String id){
        xSql = "DELETE FROM products\n"
                + "WHERE product_id=?";
        try {
            Categories c = new Categories();
            ps = con.prepareStatement(xSql);
            ps.setString(1,id);
            ps.executeUpdate();
            
            rs.close();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public void Insert(String name,String image,String price,
                        String detail,String category_id){
        xSql = "insert into products\n"
                + "VALUES(?,?,?,?,?)";
        try {
            ps = con.prepareStatement(xSql);
            ps.setString(1, name);
            ps.setString(5, image);
            ps.setString(4, price);
            ps.setString(2, detail);
            ps.setString(3, category_id);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void Edit(String id,String name, String image, String price,
            String detail, String category_id) {
        xSql = "UPDATE [products]\n"
                + "SET\n"
                + "    product_name=?,product_detail=?,\n"
                + "    category_id=?,list_price=?,product_image=?\n"
                + "WHERE product_id=?";
        try {
            ps = con.prepareStatement(xSql);
            ps.setString(1, name);
            ps.setString(5, image);
            ps.setString(4, price);
            ps.setString(2, detail);
            ps.setString(3, category_id);
            ps.setString(6, id);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws SQLException{
        ProductsDAO dao=new ProductsDAO();
        List<Products> list=dao.getProductsByCID("3");
        for (Products p : list) {
            System.out.println(p);

        }
        
    }
}
