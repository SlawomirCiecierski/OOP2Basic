package model;

public class Diamonds implements Quadrangles {

    double aSide;
    double hSide;

//    public Diamonds(double aSide, double hSide) {
//        this.aSide = aSide;
//        this.hSide = hSide;
//    }
        public double calculateField ( double aSide, double hSide)
        {
            return aSide * hSide;//diamond
        }
        @Override
        public double calculateField ( double aSide, double bSide, double hSide){
            return 0;
        }
        @Override
        public double calculateField ( double aSide){
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
//    public double gethSide() {
//        return hSide;
//    }
//
//    public void sethSide(double hSide) {
//        this.hSide = hSide;
//    }
}
