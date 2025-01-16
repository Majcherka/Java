package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Color red = new Color(255, 0, 0, 255);
        Color blue = new Color(0, 0, 255, 255);

        Shape rectangle = new Rectangle(5, 10, red);
        Shape triangle = new Triangle(3, 4, 5, blue);

        ShapeDescriber describer = new ShapeDescriber();
        describer.describe(rectangle);
        describer.describe(triangle);

        ShapeRenderer renderer = new ShapeRenderer();
        renderer.renderShapes(List.of(rectangle, triangle));
    }
}
