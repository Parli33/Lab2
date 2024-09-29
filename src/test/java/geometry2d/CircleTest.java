package geometry2d;

import exceptions.InvalidArgumentException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void area() {
        try {
            Circle circle = new Circle(2);
            assertEquals(12.566370614359172, circle.area());
        } catch (InvalidArgumentException message) {
            System.out.println(message.getMessage());
        }
    }

    @Test
    void testToString() {
        try {
            Circle circle = new Circle(2);
            assertEquals("Circle with radius = 2.0", circle.toString());
        } catch (InvalidArgumentException message) {
            System.out.println(message.getMessage());
        }
    }
}