package main;

public final class MyCircle extends Circle {

    private String color;

public MyCircle(String color, double radius) {
        super(color, (int) radius);
        this.color = color;
    }

    public String getDescription() {
        return "My " + color + " Circle has " +
                String.format("%.2f", calculatePerimeter()) +
                " perimeter and " +
                String.format("%.2f", calculateArea()) +
                " area.";
    }
}