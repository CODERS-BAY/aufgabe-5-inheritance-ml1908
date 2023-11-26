package main;

public class Circle extends Figure{
    public int radius;
    private String name;

    public Circle(String name, int radius){
        super(name);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return radius * radius * 3.14;
    }

    @Override
    public double calculatePerimeter() {
        return radius * 2 * 3.14;
    }
}
