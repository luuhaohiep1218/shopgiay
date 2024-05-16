/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.util.List;
import model.ProductSize;
import model.Size;

/**
 *
 * @author admin
 */
public class ProductSizeDAO extends  MyDAO {
    public void insertPS(String pid,String sid){
        xSql = "INSERT INTO [products_size]\n"
                + "VALUES\n"
                + "(  ?,? )";
        try {
            ps = con.prepareStatement(xSql);
            ps.setString(1, pid);
            ps.setString(2, sid);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        ProductSizeDAO dao = new ProductSizeDAO();

    }
}
