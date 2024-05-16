/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class Categories {
    private int category_Id;
    private String category_Name;

    public Categories() {
    }

    public Categories(int category_Id, String category_Name) {
        this.category_Id = category_Id;
        this.category_Name = category_Name;
    }

    public int getCategory_Id() {
        return category_Id;
    }

    public String getCategory_Name() {
        return category_Name;
    }

    public void setCategory_Id(int category_Id) {
        this.category_Id = category_Id;
    }

    public void setCategory_Name(String category_Name) {
        this.category_Name = category_Name;
    }

    @Override
    public String toString() {
        return "Categories{" + "category_Id=" + category_Id + ", category_Name=" + category_Name + '}';
    }
    

    
}
