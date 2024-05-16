/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class Customers {
    private int customer_Id;
    private String customer_Name;
    private String customer_Phone;
    private String customer_Email;
    private String customer_Street;
    private String customer_City;

    public Customers() {
    }

    public Customers(int customer_Id, String customer_Name, String customer_Phone, String customer_Email, String customer_Street, String customer_City) {
        this.customer_Id = customer_Id;
        this.customer_Name = customer_Name;
        this.customer_Phone = customer_Phone;
        this.customer_Email = customer_Email;
        this.customer_Street = customer_Street;
        this.customer_City = customer_City;
    }

    public int getCustomer_Id() {
        return customer_Id;
    }

    public String getCustomer_Name() {
        return customer_Name;
    }

    public String getCustomer_Phone() {
        return customer_Phone;
    }

    public String getCustomer_Email() {
        return customer_Email;
    }

    public String getCustomer_Street() {
        return customer_Street;
    }

    public String getCustomer_City() {
        return customer_City;
    }


    public void setCustomer_Id(int customer_Id) {
        this.customer_Id = customer_Id;
    }

    public void setCustomer_Name(String customer_Name) {
        this.customer_Name = customer_Name;
    }

    public void setCustomer_Phone(String customer_Phone) {
        this.customer_Phone = customer_Phone;
    }

    public void setCustomer_Email(String customer_Email) {
        this.customer_Email = customer_Email;
    }

    public void setCustomer_Street(String customer_Street) {
        this.customer_Street = customer_Street;
    }

    public void setCustomer_City(String customer_City) {
        this.customer_City = customer_City;
    }


    @Override
    public String toString() {
        return "Customers{" + "customer_Id=" + customer_Id + ", customer_Name=" + customer_Name + ", customer_Phone=" + customer_Phone + ", customer_Email=" + customer_Email + ", customer_Street=" + customer_Street + ", customer_City=" + customer_City + '}';
    }
    
    
}
