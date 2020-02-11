package com.ak.Pojo;

import org.springframework.beans.factory.annotation.Required;


public class Goods_Required {

    private int id;
    private String name;
    private Double price;

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public int getId() {
        return id;
    }

    @Required
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @Required
    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    @Required
    public void setPrice(Double price) {
        this.price = price;
    }
}
