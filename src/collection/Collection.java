package collection;

import circle.Circle;
import square.Square;
import triangle.Triangle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Logger;

public class Collection {
    public static final Logger LOGGER = Logger.getLogger(Collection.class.getName());

    Circle circle = new Circle(2);
    Triangle triangle = new Triangle(2,3);
    Square square = new Square(1);


    public void getArea() {
    ArrayList<Double> list = new ArrayList<>();
    list.add(circle.getArea());
    list.add(triangle.getArea());
    list.add(square.getArea());

    double min = Collections.min(list);
    double max = Collections.max(list);
    LOGGER.info("Min value is " + min);
    LOGGER.info("Max value is " + max);
    }
}
