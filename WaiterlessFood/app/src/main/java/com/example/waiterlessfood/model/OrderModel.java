package com.example.waiterlessfood.model;

public class OrderModel {
    private String catagary;
    private String description;
    private String date;
    private String pname;
    private String price;
    private String quantity;
    private String time;
    private String table;
    private String pid;
    private String paid;

    public OrderModel(){

    }

    public String getCatagary() {
        return catagary;
    }

    public void setCatagary(String catagary) {
        this.catagary = catagary;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public OrderModel(String paid) {
        this.paid = paid;
    }

    public String getPaid() {
        return paid;
    }

    public void setPaid(String paid) {
        this.paid = paid;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public OrderModel(String catagary, String description, String date, String pname, String price, String quantity, String time, String table, String pid) {
        this.catagary = catagary;
        this.description = description;
        this.date = date;
        this.pname = pname;
        this.price = price;
        this.quantity = quantity;
        this.time = time;
        this.table = table;
        this.pid = pid;
    }
}
