package triangle;

import shape.AbstractShape;

public class Triangle extends AbstractShape {
    private String name;
    private double base;
    private double height;

    public Triangle(String name, double base, double height) {
        this.name = name;
        this.base = base;
        this.height = height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getArea() {
        return base * height / 2;
    }
}
