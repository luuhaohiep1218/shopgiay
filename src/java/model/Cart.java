/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author admin
 */
public class Cart {
    private int cart_Id;
    private Products product_Id;
    private Account account_Id;
    private int quantity;
    private Size size;
    public Cart() {
    }

    public Cart(int cart_Id, Products product_Id, Account account_Id, int quantity, Size size) {
        this.cart_Id = cart_Id;
        this.product_Id = product_Id;
        this.account_Id = account_Id;
        this.quantity = quantity;
        this.size = size;
    }

    public int getCart_Id() {
        return cart_Id;
    }

    public Products getProduct_Id() {
        return product_Id;
    }

    public Account getAccount_Id() {
        return account_Id;
    }

    public int getQuantity() {
        return quantity;
    }

    public Size getSize() {
        return size;
    }

    public void setCart_Id(int cart_Id) {
        this.cart_Id = cart_Id;
    }

    public void setProduct_Id(Products product_Id) {
        this.product_Id = product_Id;
    }

    public void setAccount_Id(Account account_Id) {
        this.account_Id = account_Id;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Cart{" + "cart_Id=" + cart_Id + ", product_Id=" + product_Id + ", account_Id=" + account_Id + ", quantity=" + quantity + ", size=" + size + '}';
    }

    

}
