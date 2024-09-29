package geometry3d;

import exceptions.InvalidArgumentException;
import exceptions.ZeroVolumeException;
import geometry2d.Circle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {

    @Test
    void volume() {
        try {
            Circle circle = new Circle(2);
            Cylinder cylinder = new Cylinder(circle, 10);
            assertEquals(125.66370614359172, cylinder.Volume());
        } catch (ZeroVolumeException | InvalidArgumentException message) {
            System.out.println(message.getMessage());
        }
    }

    @Test
    void testToString() {
        try {
            Circle circle = new Circle(2);
            Cylinder cylinder = new Cylinder(circle, 10);
            assertEquals("Cylinder with height = 10.0 and figure = Circle with radius = 2.0", cylinder.toString());
        } catch (InvalidArgumentException message) {
            System.out.println(message.getMessage());
        }
    }
}