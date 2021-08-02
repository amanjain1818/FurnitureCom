package com.example.furniturecom.Model;

public class FurnitureitemsList {
    String name;
    String info;
    String des;
    String price;

    public FurnitureitemsList(String name, String info, String des, String price) {
        this.name = name;
        this.info = info;
        this.des = des;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getInfo() {
        return info;
    }

    public String getDes() {
        return des;
    }

    public String getPrice() {
        return price;
    }
}
