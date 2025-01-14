package com.workintech.cylinder;

public class Cylinder extends Circle {
    private double height;


    public Cylinder(double radius, double height) {
        super(radius);
        if (height < 0) {
            System.out.println("Height negatif olamaz. Height 0'a eşitleniyor.");
            this.height = 0;
        } else {
            this.height = height;
        }
    }


    public double getHeight() {
        return height;
    }


    public double getVolume() {
        return getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "radius=" + getRadius() +
                ", height=" + height +
                ", volume=" + getVolume() +
                '}';
    }
}
