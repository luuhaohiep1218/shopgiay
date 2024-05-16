/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class OrderItems {
    private int orderitem_id;
    private Orders order_Id;
    private Products products_Id;
    private int quantity;
    private int list_price;

    public OrderItems() {
    }

    public OrderItems(int orderitem_id, Orders order_Id, Products products_Id, int quantity, int list_price) {
        this.orderitem_id = orderitem_id;
        this.order_Id = order_Id;
        this.products_Id = products_Id;
        this.quantity = quantity;
        this.list_price = list_price;
    }

    public int getOrderitem_id() {
        return orderitem_id;
    }

    public Orders getOrder_Id() {
        return order_Id;
    }

    public Products getProducts_Id() {
        return products_Id;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getList_price() {
        return list_price;
    }

    public void setOrderitem_id(int orderitem_id) {
        this.orderitem_id = orderitem_id;
    }

    public void setOrder_Id(Orders order_Id) {
        this.order_Id = order_Id;
    }

    public void setProducts_Id(Products products_Id) {
        this.products_Id = products_Id;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setList_price(int list_price) {
        this.list_price = list_price;
    }

    @Override
    public String toString() {
        return "OrderItems{" + "orderitem_id=" + orderitem_id + ", order_Id=" + order_Id + ", products_Id=" + products_Id + ", quantity=" + quantity + ", list_price=" + list_price + '}';
    }

    
}
