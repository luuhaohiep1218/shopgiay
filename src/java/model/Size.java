/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class Size {
    private int size_Id;
    private String size_Name;

    public Size() {
    }

    public Size(int size_Id, String size_Name) {
        this.size_Id = size_Id;
        this.size_Name = size_Name;
    }

    public int getSize_Id() {
        return size_Id;
    }

    public String getSize_Name() {
        return size_Name;
    }

    public void setSize_Id(int size_Id) {
        this.size_Id = size_Id;
    }

    public void setSize_Name(String size_Name) {
        this.size_Name = size_Name;
    }

    @Override
    public String toString() {
        return "Size{" + "size_Id=" + size_Id + ", size_Name=" + size_Name + '}';
    }
    
}
