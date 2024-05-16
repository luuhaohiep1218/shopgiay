/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.util.List;
import model.Account;

/**
 *
 * @author admin
 */
public class AccountDAO extends MyDAO {
    public Account Login(String user,String pass) {
        xSql = "select * from account where [user]=? "
                + "and [password]=?";
        try {
            ps = con.prepareStatement(xSql);
            ps.setString(1, user);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Account(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4));
            }
        } catch (Exception e) {
        }
        return null;
    }
    public Account checkAccountExits(String user){
        xSql="select * from account where [user]=?";
        try {
            ps = con.prepareStatement(xSql);
            ps.setString(1, user);
            rs = ps.executeQuery();
            while (rs.next()) {
                return  new Account(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4));
            }
        } catch (Exception e) {
        }
        return null;
    }
    public void Signup(String user,String pass){
        xSql="insert into Account\n"
                + "VALUES(?,?,0)";
        try {
            ps = con.prepareStatement(xSql);
            ps.setString(1, user);
            ps.setString(2, pass);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    public static void main(String[] args){
        AccountDAO dao = new AccountDAO();
        Account l=dao.Login("hieplh", "123");
        Account list =dao.checkAccountExits("hieplh");
        
            System.out.println(l);

    }
}
