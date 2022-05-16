package circle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {


    @Test
    void getArea() {
        Circle circle = new Circle(5);
        assertEquals(78.53981633974483,circle.getArea());
    }
}