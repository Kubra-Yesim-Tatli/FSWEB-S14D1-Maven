package com.workintech.pool;

public class Cuboid extends Rectangle {
    private double height;

    // Constructor
    public Cuboid(double width, double length, double height) {
        super(width, length); // Call Rectangle's constructor
        this.height = (height < 0) ? 0 : height;
    }

    // Getter for height
    public double getHeight() {
        return height;
    }

    // Method to calculate volume
    public double getVolume() {
        return getArea() * height;
    }
}
