package geometry2d;

import exceptions.InvalidArgumentException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void area() {
        try {
            Rectangle rectangle = new Rectangle(4,5);
            assertEquals(4.0,rectangle.area());
        } catch (InvalidArgumentException message) {
            System.out.println(message.getMessage());
        }
    }

    @Test
    void testToString() {
        try {
            Rectangle rectangle = new Rectangle(4,5);
            assertEquals("Rectangle with width = 4.0 and height = 5.0",rectangle.toString());
        } catch (InvalidArgumentException message) {
            System.out.println(message.getMessage());
        }
    }
}