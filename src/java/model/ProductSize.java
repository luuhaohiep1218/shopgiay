/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class ProductSize {
    private Products product_Id;
    private Size size_Id;

    public ProductSize() {
    }

    public ProductSize(Products product_Id, Size size_Id) {
        this.product_Id = product_Id;
        this.size_Id = size_Id;
    }

    public Products getProduct_Id() {
        return product_Id;
    }

    public Size getSize_Id() {
        return size_Id;
    }

    public void setProduct_Id(Products product_Id) {
        this.product_Id = product_Id;
    }

    public void setSize_Id(Size size_Id) {
        this.size_Id = size_Id;
    }

    @Override
    public String toString() {
        return "ProductSize{" + "product_Id=" + product_Id + ", size_Id=" + size_Id + '}';
    }
    
}
