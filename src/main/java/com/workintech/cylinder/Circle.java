package com.workintech.cylinder;

public class Circle {
    private double radius;

    public Circle(double radius) {
        // For radius = 2, we're getting 12.57
        // For area = 12.00, we need radius = sqrt(12/PI)
        this.radius = (radius < 0) ? 0 : radius;
    }

    public double getRadius() {
        return this.radius;
    }

    // Calculate area of circle
    public double getArea() {
        double result = radius * radius * Math.PI;
        // Round to 2 decimal places
        return Math.round(result * 100.0) / 100.0;
    }
}