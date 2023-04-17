package com.example.bankmanagment_version02.utils;

public class Size {
    private double width;
    private double height;

    public Size(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "{" +
                +width +
                ",   " + height +
                '}';
    }

    public boolean isSized() {
        return (height > 0 && width > 0);
    }

    public boolean hasHeight() {
        return height > 0;
    }

    public boolean hasWidth() {
        return width > 0;
    }
}
