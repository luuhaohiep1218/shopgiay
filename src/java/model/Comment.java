/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class Comment {
    private int comment_id,product_id ;
    private String comment_detail;
    private String comment_time;
    private Account account_id;

    public Comment() {
    }

    public Comment(int comment_id, int product_id, String comment_detail, String comment_time, Account account_id) {
        this.comment_id = comment_id;
        this.product_id = product_id;
        this.comment_detail = comment_detail;
        this.comment_time = comment_time;
        this.account_id = account_id;
    }

    public int getComment_id() {
        return comment_id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public String getComment_detail() {
        return comment_detail;
    }

    public String getComment_time() {
        return comment_time;
    }

    public Account getAccount_id() {
        return account_id;
    }

    public void setComment_id(int comment_id) {
        this.comment_id = comment_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public void setComment_detail(String comment_detail) {
        this.comment_detail = comment_detail;
    }

    public void setComment_time(String comment_time) {
        this.comment_time = comment_time;
    }

    public void setAccount_id(Account account_id) {
        this.account_id = account_id;
    }

    @Override
    public String toString() {
        return "Comment{" + "comment_id=" + comment_id + ", product_id=" + product_id + ", comment_detail=" + comment_detail + ", comment_time=" + comment_time + ", account_id=" + account_id + '}';
    }

   
}
