package main;

public class Rectangle extends Figure {

    public int length;

    public int width;

    private String name;
    public Rectangle (String name, int length, int width){
        super(name);
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea(){
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}
