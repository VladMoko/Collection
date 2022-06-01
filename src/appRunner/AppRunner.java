package appRunner;

import circle.Circle;
import shape.Shape;
import square.Square;
import triangle.Triangle;

import java.util.ArrayList;
import java.util.logging.Logger;

public class AppRunner {

    public static final Logger LOGGER = Logger.getLogger(AppRunner.class.getName());

    public static void main(String[] args) {
        //Makes new collection
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Square(2));
        shapes.add(new Circle(5));
        shapes.add(new Triangle(5, 2));

        //Set index to zero
        Shape min = shapes.get(0);
        Shape max = shapes.get(0);

        //Search min & max element
        for (Shape i: shapes) {
            if (min.getArea() > i.getArea()){
                min = i;
            }
            if (max.getArea() < i.getArea()){
                max = i;
            }
        }
        //Writing info about our elements
        LOGGER.info("Min area is " + min.getArea() + ", shape is " + min.getClass().getSimpleName());
        LOGGER.info("max area is " + max.getArea() + ", shape is " + max.getClass().getSimpleName());
    }
}
