package model;

public class Squares implements Quadrangles {

    double aSide;


    public double calculateField(double aSide)
    {
        return aSide * aSide; //square
    }

    @Override
    public double calculateField(double aSide, double bSide) {
        return 0;
    }

    @Override
    public double calculateField(double aSide, double bSide, double hSide) {
        return 0;
    }
//    public Squares(double aSide) {
//        this.aSide = aSide;
//    }

//    public double calculateField(double aSide) {
//        return aSide * aSide;
//    }
}
