package com.reactivestax.domain;

public class Triangle implements IShape{
    private int dimension1;
    private int dimension2;
    private int area;

    public int getDimension1() {
        return dimension1;
    }

    public void setDimension1(int dimension1) {
        this.dimension1 = dimension1;
    }

    public int getDimension2() {
        return dimension2;
    }

    public void setDimension2(int dimension2) {
        this.dimension2 = dimension2;
    }

    public int generateArea(){
        area = dimension1 * dimension2;
        return area;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "dimension1=" + dimension1 +
                ", dimension2=" + dimension2 +
                ", area=" + area +
                '}';
    }

    @Override
    public int calculateArea() {
        return generateArea();
    }

    @Override
    public String generateToStringRepresentation() {
        return toString();
    }
}
