package main;

public final class MyRectangle extends Rectangle {

    private String color;

    public MyRectangle(String color, double length, double width) {
        super(color, (int) length, (int) width);
        this.color = color;
    }

    public String getDescription(){
        return "My " + color + " Rectangle has " + String.format("%.2f", calculatePerimeter()) +
                " perimeter and " +
                String.format("%.2f", calculateArea()) +
                " area.";
    }
}
