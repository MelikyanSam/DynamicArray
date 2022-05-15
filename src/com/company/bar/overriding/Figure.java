package com.company.bar.overriding;

public abstract class Figure {

        double dim1;
        double dim2;
        Figure(double a,double b){
            dim1 = a;
            dim2 = b;
        }
        abstract void callme();
        abstract double area();

        void callMeToo(){
            System.out.println("here, take it!");
        }

}
