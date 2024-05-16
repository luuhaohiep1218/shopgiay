/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import model.Cart;

/**
 *
 * @author admin
 */
public class OrderItemsDAO extends MyDAO {
    public void InsertOrderItems(int oid,Cart cart) {
        xSql = "INSERT INTO [order_items]\n"
                + "VALUES\n"
                + "(?,?,?,?)";
        try {
            ps = con.prepareStatement(xSql);
            ps.setInt(1, oid);
            ps.setInt(2, cart.getProduct_Id().getpId());
            ps.setInt(3, cart.getQuantity());
            ps.setInt(4, cart.getProduct_Id().getpPrice()*cart.getQuantity());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
