/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class Products {
    private int pId;
    private String pName,pDetail;
    private int pPrice;
    private String pImage;
    private Categories category_Id;

    public Products() {
    }

    public Products(int pId, String pName, String pDetail, int pPrice, String pImage, Categories category_Id) {
        this.pId = pId;
        this.pName = pName;
        this.pDetail = pDetail;
        this.pPrice = pPrice;
        this.pImage = pImage;
        this.category_Id = category_Id;
    }

    public int getpId() {
        return pId;
    }

    public String getpName() {
        return pName;
    }

    public String getpDetail() {
        return pDetail;
    }

    public int getpPrice() {
        return pPrice;
    }

    public String getpImage() {
        return pImage;
    }

    public Categories getCategory_Id() {
        return category_Id;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public void setpDetail(String pDetail) {
        this.pDetail = pDetail;
    }

    public void setpPrice(int pPrice) {
        this.pPrice = pPrice;
    }

    public void setpImage(String pImage) {
        this.pImage = pImage;
    }

    public void setCategory_Id(Categories category_Id) {
        this.category_Id = category_Id;
    }

    @Override
    public String toString() {
        return "Products{" + "pId=" + pId + ", pName=" + pName + ", pDetail=" + pDetail + ", pPrice=" + pPrice + ", pImage=" + pImage + ", category_Id=" + category_Id + '}';
    }

    
}
