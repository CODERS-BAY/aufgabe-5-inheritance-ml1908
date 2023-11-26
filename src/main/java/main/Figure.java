package main;

abstract public class Figure implements IFigure {
    private String name;


    public Figure(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}
