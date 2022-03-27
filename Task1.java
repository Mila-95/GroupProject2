package com.syntax.GroupProject2;

public class Task1 {
    public static void main(String[] args) {
        com.syntax.ProjectAsgar.Square s = new com.syntax.ProjectAsgar.Square();
        s.calculatePeramiter(10);
        // ((Square)s).test();
    }
}
interface Shape{
    void calculateArea(double input);
    void calculatePeramiter(double input);
}
class Circle implements com.syntax.ProjectAsgar.Shape {

    @Override
    public void calculateArea(double input) {
        double area=Math.PI*Math.pow(input,2);
        System.out.println(area);
    }

    @Override
    public void calculatePeramiter(double input) {
        System.out.println(2*Math.PI*input);
    }
}
class Square implements com.syntax.ProjectAsgar.Shape {

    @Override
    public void calculateArea(double input) {
        double area=input*input;
        System.out.println(area);
    }

    @Override
    public void calculatePeramiter(double input) {
        double peramiter=4*input;
        System.out.println(peramiter);
    }
}
