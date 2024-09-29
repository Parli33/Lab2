package geometry2d;

import exceptions.InvalidArgumentException;

public class Rectangle implements Figure {
    private final double width;
    private final double height;

    public Rectangle(double width, double height) throws InvalidArgumentException {
        if (width <= 0 || height <= 0) {
            throw new InvalidArgumentException("Side must be greater than 0");
        }
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Rectangle with width = " + width + " and height = " + height;
    }

}
