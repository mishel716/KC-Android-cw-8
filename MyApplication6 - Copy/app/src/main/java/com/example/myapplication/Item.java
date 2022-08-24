package com.example.myapplication;

import java.io.Serializable;

public class Item implements Serializable {
    private String itemName;
    private double itemPrice;
    private int itemImg;
    private String itemdes;

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getItemImg() {
        return itemImg;
    }

    public void setItemImg(int itemImg) {
        this.itemImg = itemImg;
    }

    public String getItemdes() {
        return itemdes;
    }

    public void setItemdes(String itemdes) {
        this.itemdes = itemdes;
    }

    public Item(String itemName, double itemPrice, int itemImg, String itemdes) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemImg = itemImg;
        this.itemdes = itemdes;
    }
}

