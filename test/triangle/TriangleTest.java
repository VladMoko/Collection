package triangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {


    @Test
    void getArea() {
        Triangle triangle = new Triangle(2,2);
        assertEquals(2,triangle.getArea());
    }
}