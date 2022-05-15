package com.company.bar.overriding;

public class Triangle extends Figure{
    Triangle(double a, double b){
        super(a,b);
    }
    @Override
    double area (){
        System.out.println("Inside area for Triangle");
        return dim1 * dim2 / 2;
    }

    @Override
    void callme() {
        System.out.println("Hi Triangle");
    }
}
