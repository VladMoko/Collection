package square;

import shape.AbstractShape;

public class Square extends AbstractShape {
    private String name;
    private double side;

    public Square(String name, double side) {
        this.name = name;
        this.side = side;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
