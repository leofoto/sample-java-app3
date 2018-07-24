package com.reactivestax.domain;

public class Rectangle implements IShape {
    private static int area;
    private int length;
    private int width;

    public static String rectangleName ;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public int calculateArea() {
        return length * width;
    }

    @Override
    public String generateToStringRepresentation() {
        return toString();
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public static String getRectangleName() {
        return rectangleName;
    }

    public static void setRectangleName(String rectangleName) {
        Rectangle.rectangleName = rectangleName;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
