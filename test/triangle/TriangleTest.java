package triangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void getName() {
        Triangle triangle = new Triangle("Triangle",2,2);
        assertEquals("Triangle",triangle.getName());
    }

    @Test
    void getArea() {
        Triangle triangle = new Triangle("Triangle",2,2);
        assertEquals(2,triangle.getArea());
    }
}