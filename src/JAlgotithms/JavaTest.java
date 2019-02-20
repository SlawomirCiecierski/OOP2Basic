package JAlgotithms;

public class JavaTest {

    public int potegowanie(int liczba, int potega) {
        int licznik;
        int liczbaPom = 1;
        if (potega == 0) {
            return 1;
        }
        for (licznik = 1; licznik <= potega; licznik++) {
            liczbaPom = liczbaPom * liczba;
        }
        return liczbaPom;
    }

    public int silnia(int liczba) {
        int liczbaPom = 1;
        if (liczba == 0) {
            return 1;
        }
        for (int licznik = 1; licznik <= liczba; licznik++) {
            liczbaPom = liczbaPom * licznik;
        }
        return liczbaPom;
    }

    public void ciagGeometryczny(double liczba, double iloraz, int dlugosc) {
        double liczbaPom = liczba;
        for (int licznik = 1; licznik <= dlugosc; licznik++) {
            System.out.println(liczbaPom = liczbaPom * iloraz);
        }
    }

    public void ciagArytmetyczny(double liczba, double roznica, int dlugosc) {
        double liczbaPom = liczba;
        for (int licznik = 1; licznik <= dlugosc; licznik++) {
            System.out.println(liczbaPom = liczbaPom + roznica);
        }
    }

    public boolean czyLiczbaDoskonala(int liczba) {
        int liczbaPomocnicza = 0;

        for (int licznik = 1; licznik < liczba; licznik++) {
            if (liczba % licznik == 0) {
                liczbaPomocnicza = liczbaPomocnicza + licznik;
            }
        }
        if (liczba == liczbaPomocnicza) {
            return true;
        } else {
            return false;
        }

    }

    public int getNWD(int x, int y) {
        //spr większej mniejszej
        int less = x;
        int greater = y;
        if (x > y) {
            less = y;
            greater = x;
        }
        //2. iterujemy w pętli i sprawdzamy czy dzielnik less
        //jest dzielnikiem greater
        for (int i = less;
        less > 1;
        i--){
            if( less % i == 0 && greater % 1 == 0){
                return i;
            }
        }
        return 1;

    }

    public String konwerterBin (int liczba){
        int liczbaPom;
        String binary="";
        while (liczba>=1){
            binary=binary.concat(String.valueOf(liczba%2));
            liczba=liczba/2;
        }
        //odwrócenie liczby
        StringBuffer sb=new StringBuffer(binary);
        return sb.reverse().toString();
        //można w skrócie:
        //return new StringBuffer(binary).reverse().toString();

    }

    public int konwerterBinToDec(String binary){
        int decimal=0;
        for(int i=0; i<binary.length(); i++){
            decimal=decimal+(((int)binary.charAt(i)-48)*potegowanie(2,(binary.length()-1)-i));

        }
        return decimal;
    }
}
