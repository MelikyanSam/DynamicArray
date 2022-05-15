package com.company.bar.overriding;

public class Rectangle extends  Figure {
    Rectangle(double a, double b){
        super(a,b);
    }

    @Override
    void callme() {
        System.out.println("Hey a am Rectangle");
    }


    @Override
    double area() {
        System.out.println("Inside area for Rectangle");
        return dim1 * dim2;
    }
}
