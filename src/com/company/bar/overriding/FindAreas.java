package com.company.bar.overriding;

public class FindAreas {
    public static void main(String[] args) {
//        Figure myFigure = new Figure(10, 10);
        Rectangle myRectangle = new Rectangle(9, 5);
        Triangle myTriangle = new Triangle(10, 8);

        Figure figure;
        figure = myRectangle;

        figure.callme();
    }
}
