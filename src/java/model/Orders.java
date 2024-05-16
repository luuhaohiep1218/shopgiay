/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author admin
 */
public class Orders {
    private int order_Id;
    private Customers customer_Id;
    private Date order_Date;
    private int total;

    public Orders() {
    }

    public Orders(int order_Id, Customers customer_Id, Date order_Date, int total) {
        this.order_Id = order_Id;
        this.customer_Id = customer_Id;
        this.order_Date = order_Date;
        this.total = total;
    }

    public int getOrder_Id() {
        return order_Id;
    }

    public Customers getCustomer_Id() {
        return customer_Id;
    }

    public Date getOrder_Date() {
        return order_Date;
    }

    public int getTotal() {
        return total;
    }

    public void setOrder_Id(int order_Id) {
        this.order_Id = order_Id;
    }

    public void setCustomer_Id(Customers customer_Id) {
        this.customer_Id = customer_Id;
    }

    public void setOrder_Date(Date order_Date) {
        this.order_Date = order_Date;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Orders{" + "order_Id=" + order_Id + ", customer_Id=" + customer_Id + ", order_Date=" + order_Date + ", total=" + total + '}';
    }

    
    
}
