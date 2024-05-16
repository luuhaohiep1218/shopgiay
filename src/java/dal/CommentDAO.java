/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import model.Account;
import model.Categories;
import model.Comment;
import model.Customers;
import model.Orders;
import model.Products;

/**
 *
 * @author admin
 */
public class CommentDAO extends MyDAO {

    public void Insert(String pid, String aid, String comment
    ) {
        LocalDateTime curDate = java.time.LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String date = curDate.format(formatter);
        xSql = "INSERT INTO [dbo].[comment]\n"
                + "(\n"
                + " [product_id], [account_id], [comment_detail],[comment_time]\n"
                + ")\n"
                + "VALUES\n"
                + "( \n"
                + " ?, ?, ?,?\n"
                + ")";
        try {
            ps = con.prepareStatement(xSql);
            ps.setString(1, pid);
            ps.setString(2, aid);
            ps.setString(3, comment);
            ps.setString(4, date);

            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Comment> getCommentByPid(String pid) {

        List<Comment> t = new ArrayList<>();
        xSql = "SELECT * from comment c JOIN account a on c.account_id=a.account_id\n"
                + "WHERE product_id=?";
        try {
            ps = con.prepareStatement(xSql);
            ps.setString(1, pid);
            rs = ps.executeQuery();
            while (rs.next()) {
                Comment c = new Comment();
                Account a = new Account();
                c.setComment_id(rs.getInt(1));
                c.setProduct_id(rs.getInt(2));
                a.setAccount_Id(rs.getInt(3));
                c.setComment_detail(rs.getString(4));
                c.setComment_time(rs.getString(5));
                a.setAccount_Id(rs.getInt(6));
                a.setUser(rs.getString(7));
                a.setPassword(rs.getString(8));
                a.setIsAdmin(rs.getInt(9));
                c.setAccount_id(a);
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
        CommentDAO dao = new CommentDAO();
        List<Comment> c = dao.getCommentByPid("5");
        for (Comment comment : c) {
            System.out.println(comment);
        }

    }
}
