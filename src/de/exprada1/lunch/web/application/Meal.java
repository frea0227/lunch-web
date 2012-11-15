package de.exprada1.lunch.web.application;

import java.util.Date;

public class Meal {

    private String guid;
    private String name;
    private Date date;
    private double price;

    public Meal() {

    }

    public Meal(String name, double price, Date date) {
        this.name = name;
        this.price = price;
        this.date = date;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }
}
