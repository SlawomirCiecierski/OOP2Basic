package model;

public class Trapezes{

    double aSide;
    double bSide;
    double hSide;

    public double calculateField(double aSide, double bSide, double hSide);
    {
        return ((aSide + bSide) * hSide)/2; //trapeze
    }

}
