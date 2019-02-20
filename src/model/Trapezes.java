package model;

public class Trapezes implements Quadrangles{

    double aSide;
    double bSide;
    double hSide;

    public double calculateField(double aSide, double bSide, double hSide)
    {
        return ((aSide + bSide) * hSide)/2; //trapeze
    }
    @Override
    public double calculateField(double aSide) {
        return 0;
    }

    @Override
    public double calculateField(double aSide, double bSide) {
        return 0;
    }



}
