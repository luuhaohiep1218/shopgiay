/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class Account {
    private int account_Id;
    private String user;
    private String password;
    private int isAdmin;

    public Account() {
    }

    public Account(int account_Id, String user, String password, int isAdmin) {
        this.account_Id = account_Id;
        this.user = user;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    public int getAccount_Id() {
        return account_Id;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public int getIsAdmin() {
        return isAdmin;
    }

    public void setAccount_Id(int account_Id) {
        this.account_Id = account_Id;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setIsAdmin(int isAdmin) {
        this.isAdmin = isAdmin;
    }

    @Override
    public String toString() {
        return "Account{" + "account_Id=" + account_Id + ", user=" + user + ", password=" + password + ", isAdmin=" + isAdmin + '}';
    }
    
}