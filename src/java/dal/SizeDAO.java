/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.util.ArrayList;
import java.util.List;
import model.Categories;
import model.Products;
import model.Size;

/**
 *
 * @author admin
 */
public class SizeDAO extends MyDAO{
    public List<Size> getSize(){
        List<Size> t = new ArrayList<>();
        xSql = "select * from [size]";
        try {
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Size s=new Size();
                s.setSize_Id(rs.getInt(1));
                s.setSize_Name(rs.getString(2));
                t.add(s);
            }
            rs.close();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (t);
    }
    public static void main(String[] args) {
        SizeDAO dao=new SizeDAO();
        List<Size> list=dao.getSize();
        for (Size size : list) {
            System.out.println(size);
        }
        

    }
}
