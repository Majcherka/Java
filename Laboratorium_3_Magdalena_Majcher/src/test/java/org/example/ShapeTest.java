package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShapeTest {
    @Test
    public void testRectangle() {
        Color red = new Color(255, 0, 0, 255);
        Rectangle rectangle = new Rectangle(5, 10, red);

        assertEquals(50, rectangle.getArea());
        assertEquals(30, rectangle.getPerimeter());
    }

    @Test
    public void testTriangle() {
        Color blue = new Color(0, 0, 255, 255);
        Triangle triangle = new Triangle(3, 4, 5, blue);

        assertEquals(6, triangle.getArea(), 0.01);
        assertEquals(12, triangle.getPerimeter());
    }
}
