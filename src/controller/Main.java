package controller;

import model.*;


public class Main {
    public static void main(String[] args) {
        Squares mySquare = new Squares();
        Rectangles myRectangle = new Rectangles();
        Diamonds myDiamond = new Diamonds();
        Trapezes myTrapeze = new Trapezes();

        System.out.println("Pole powierzchni kwadratu: " + mySquare.calculateField(1.82));
        System.out.println("Pole powierzchni prostokąta: " + myRectangle.calculateField(1.28, 5.5));
        System.out.println("Pole powierzchni rombu: " + myDiamond.calculateField(1.88, 5.5));
        System.out.println("Pole powierzchni trapezu: " + myTrapeze.calculateField(1.83, 5.5, 33));


    }
}
