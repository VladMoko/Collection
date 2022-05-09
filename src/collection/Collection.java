package collection;

import circle.Circle;
import shape.Shape;
import square.Square;
import triangle.Triangle;

import java.util.ArrayList;
import java.util.logging.Logger;

public class Collection {

    public static final Logger LOGGER = Logger.getLogger(Collection.class.getName());

    Circle circle = new Circle("Circle",2);
    Triangle triangle = new Triangle("Triangle",2,3);
    Square square = new Square("Square",1);
    private double min;
    private double max;

    public double getMin() {
        return min;
    }

    public void setMin(double min) {
        this.min = min;
    }

    public double getMax() {
        return max;
    }

    public void setMax(double max) {
        this.max = max;
    }

    public void array(){
        ArrayList<Shape> list = new ArrayList<>();
        list.add(0,circle);
        list.add(1,square);
        list.add(2,triangle);

        if (list.get(0).getArea() < list.get(1).getArea() && list.get(0).getArea() < list.get(2).getArea()){
            min = list.get(0).getArea();
            LOGGER.info(min + " " + list.get(0).getName());
        }else if (list.get(1).getArea() < list.get(0).getArea() && list.get(1).getArea() < list.get(2).getArea()){
            min = list.get(1).getArea();
            LOGGER.info(min + " " + list.get(1).getName());
        }else {
            min = list.get(2).getArea();
            LOGGER.info(min + " " + list.get(2).getName());
        }

        if (list.get(0).getArea() > list.get(1).getArea() && list.get(0).getArea() > list.get(2).getArea()){
            max = list.get(0).getArea();
            LOGGER.info(max + " " + list.get(0).getName());
        }else if (list.get(1).getArea() > list.get(0).getArea() && list.get(1).getArea() > list.get(2).getArea()){
            max = list.get(1).getArea();
            LOGGER.info(max + " " + list.get(1).getName());
        } else {
            max = list.get(2).getArea();
            LOGGER.info(max + " " + list.get(2).getName());
        }
    }
}
