package com.reactivestax.domain;

public class Square implements IShape {
    private int sideLength;
    private int area;

    public int getArea() {
        return area;
    }

    @Override
    public int calculateArea() {
        return sideLength * sideLength;
    }

    @Override
    public String generateToStringRepresentation() {
        return null;
    }

    public int getSideLength() {
        return sideLength;
    }

    public void setSideLength(int sideLength) {
        this.sideLength = sideLength;
    }

    public void setArea(int area) {
        this.area = area;
    }
}
