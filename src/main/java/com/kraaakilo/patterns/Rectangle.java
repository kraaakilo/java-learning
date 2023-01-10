package com.kraaakilo.patterns;

public class Rectangle implements VolumeCalculatorInterface, AreaCalculatorInterface {
    private int width;
    private int height;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }


    @Override
    public String toString() {
        return "Height - " + this.height + "\n******\nWidth - " + this.width;
    }

    public Rectangle() {
        width = 0;
        height = 0;
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double volume() {
        return 0;
    }
}
