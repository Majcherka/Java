package org.example;

public abstract class Shape {
    private final Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public String getColorDescription() {
        return color.toString();
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}
