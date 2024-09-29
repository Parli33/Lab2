package geometry2d;

import exceptions.InvalidArgumentException;

public class Circle implements Figure {
    private final double radius;

    public Circle(double radius) throws InvalidArgumentException {
        if (radius <= 0) {
            throw new InvalidArgumentException("Radius must be greater than 0");
        }
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle with radius = " + radius;
    }
}
