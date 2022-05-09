package circle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void getName() {
        Circle circle = new Circle("Circle",5);
        assertEquals("Circle",circle.getName());
    }

    @Test
    void getArea() {
        Circle circle = new Circle("Circle",5);
        assertEquals(78.53981633974483,circle.getArea());
    }
}