package JAlgotithms;

public class Main {
    public static void main(String[] args) {
        System.out.println("Algorytmy!");
        JavaTest algorytmy=new JavaTest();

        System.out.println("potęga: " + algorytmy.potegowanie(3,0));
        System.out.println("silnia: " + algorytmy.silnia(0));
        System.out.println("ciąg geometryczny: ");
        algorytmy.ciagGeometryczny(2.0, 3, 7);
        System.out.println("ciąg arytmetyczny: ");
        algorytmy.ciagArytmetyczny(3.0, 2, 7);
        System.out.println("Liczba doskonała " + algorytmy.czyLiczbaDoskonala(6));
        System.out.println("NWD " + algorytmy.getNWD(38, 12));
        System.out.println("NWD " + algorytmy.konwerterBin(15));

    }
}
