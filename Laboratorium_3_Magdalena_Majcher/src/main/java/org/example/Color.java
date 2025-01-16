package org.example;

public class Color {
    private final int red, green, blue, alpha;

    public Color(int red, int green, int blue, int alpha) {
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.alpha = alpha;
    }

    @Override
    public String toString() {
        return String.format("Red: %d, Green: %d, Blue: %d, Alpha: %d", red, green, blue, alpha);
    }
}
