package org.example.figure;

public abstract class Shape implements Perimeter, Area {
    protected String fillColor;
    protected String borderColor;

    public Shape(String fillColor, String borderColor) {
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    public abstract void displayInfo();
}
