package model;
//
public interface Quadrangles {
    static double aSide=0;
    static double bSide=0;
    static double hSide=0;

    //
//    //    public double getaSide();
////
////    public void setaSide(double aSide);
////
////    public double getbSide();
////
////    public void setbSide(double bSide);
////
////    public double gethSide();
////
////    public void sethSide(double hSide);
//    //public double calculateField();
//
//    public abstract double calculateField();
//
    public double calculateField(double aSide);

//    {
//        return aSide * aSide; //square
//    }

    public double calculateField(double aSide, double bSide);

//    {
//        return 0;
//        // return aSide * bSide; //rectangle
//    }


    //public double calculateField(double aSide, double hSide);

//    {
//        return 0.0;
//        return aSide * hSide;//diamond
//    }

    public double calculateField(double aSide, double bSide, double hSide);

//    {
//        return ((aSide + bSide) * hSide) / 2; //trapeze
//    }
}
//
////utworzyć interfejs by umożliwić tworzenie obiektów:
////1.Kwadratów
////2.Prostokątów
////3.Rombów
////4.trapezów
