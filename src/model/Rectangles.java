package model;

public class Rectangles implements Quadrangles{

   double aSide;
   double bSide;

    @Override
    public double calculateField(double aSide) {
        return 0;
    }

   // public double calculateField(double aSide, double bSide);

    @Override
    public double calculateField(double aSide, double bSide, double hSide) {
        return 0;
    }

//    public double getaSide() {
//        return aSide;
//    }
//
//    public void setaSide(double aSide) {
//        this.aSide = aSide;
//    }
//
//    public double getbSide() {
//        return bSide;
//    }
//
//
//    public void setbSide(double bSide) {
//        this.bSide = bSide;
//    }

//    public Rectangles(double aSide, double bSide) {
//        this.aSide = aSide;
//        this.bSide = bSide;
//    }

    public double calculateField(double aSide, double bSide) {
        return aSide * bSide;
    }
}
