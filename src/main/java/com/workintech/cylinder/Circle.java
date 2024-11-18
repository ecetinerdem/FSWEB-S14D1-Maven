package com.workintech.cylinder;

public class Circle {
    // radius should be double since we're dealing with Math.PI and decimal calculations
    private double radius;

    // Constructor
    public Circle(double radius) {
        // If radius is negative, set it to 0
        this.radius = (radius < 0) ? 0 : radius;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Calculate area of circle
    public double getArea() {
        return radius * radius * Math.PI;
    }
}