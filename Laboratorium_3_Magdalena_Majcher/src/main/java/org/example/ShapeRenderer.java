package org.example;

import java.util.List;

public class ShapeRenderer {
    public void renderShapes(List<Shape> shapes) {
        for (Shape shape : shapes) {
            System.out.println("Drawing shape: " + shape.getClass().getSimpleName());
            System.out.println("Color: " + shape.getColorDescription());
            System.out.println("Area: " + shape.getArea());
            System.out.println("Perimeter: " + shape.getPerimeter());
            System.out.println("-------------");
        }
    }
}
