/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.util.ArrayList;
import java.util.List;
import model.Categories;

/**
 *
 * @author admin
 */
public class CategoriesDAO extends MyDAO {
    public List<Categories> getAllCategories() {
        List<Categories> t = new ArrayList<>();
        xSql = "select * from Categories";
        try {
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Categories c=new Categories();
                c.setCategory_Id(rs.getInt(1));
                c.setCategory_Name(rs.getString(2));
                t.add(c);
            }
            rs.close();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (t);
    }
    public static void main(String[] args) {
        CategoriesDAO dao = new CategoriesDAO();
        List<Categories> list = dao.getAllCategories();
        for (Categories c : list) {
            System.out.println(c);
        }
    }
}
