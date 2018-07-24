package com.reactivestax.domain;

public abstract class Shape {
    private int length = 10;
    private int width = 20;

    public int calculateArea() {
        return length * width;
    }
    public String generateToStringRepresentation(){
        return "EMPTY_STRING";
    }

}
