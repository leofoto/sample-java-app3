package com.reactivestax;


import com.reactivestax.domain.Rectangle;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
//        System.out.println( "Hello World!" );

//        Triangle triangle = new Triangle();
//
//        triangle.setDimension1(12);
//        triangle.setDimension2(10);
//        triangle.generateArea();
//        System.out.println("toString:: triangle = " + triangle);
//
//        System.out.println("generateToString:: triangle = " + triangle.generateToStringRepresentation());

        Rectangle rectangle = new Rectangle(10, 20);
        System.out.println("rectangle = " + rectangle + Rectangle.getRectangleName());

        Rectangle anotherRectangle = new Rectangle(20, 30);
        anotherRectangle.setArea(10);
        anotherRectangle.setRectangleName("AnotherRectangle");
        System.out.println("anotherRectangle = " + anotherRectangle + Rectangle.getRectangleName());

        System.out.println("rectangle = " + rectangle + Rectangle.getRectangleName());

//        try {
        calculateSomething();
//        } catch (Exception e) {
//            System.out.println("do something else ");
//        }

        System.out.println("main program still running..");

    }

    private static void calculateSomething() {
        System.out.println("about to start calculation = ");

        throw new RuntimeException("calculation cannot happen right now..some problem sorry try again");
    }
}
