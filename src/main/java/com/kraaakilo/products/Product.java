package com.kraaakilo.products;
public class Product<T> {
    public Product(String name, double price, T t) {
        this.name = name;
        this.price = price;
        this.t = t;
        System.out.println(t.getClass());
    }
    public Product() {
        this.name = "Moto";
        this.price = 1500;
        this.t = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    private String name;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    private double price;

    public T getUser() {
        return t;
    }

    public void setUser(T t) {
        this.t = t;
    }

    private T t;
}
