package com.workintech.cylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder (double radius, double height) {
        super(radius);
        // If height is negative, set it to 0
        this.height = (height < 0) ? 0 : height;
    }

    // Getter for height
    public double getHeight() {
        return height;
    }

    // Calculate volume of cylinder
    public double getVolume() {
        return getArea() * height;
    }
}
