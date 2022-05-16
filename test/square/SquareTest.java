package square;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {


    @Test
    void getArea() {
        Square square = new Square(2);
        assertEquals(4,square.getArea());
    }
}