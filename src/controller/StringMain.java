package controller;

public class StringMain {

    public static void main(String[] args) {
        StringController sc=new StringController();
        System.out.println(("Contains a: "+ sc.isCharacter('s')));
        System.out.println(("Contains y: "+ sc.isCharacter('y')));
        System.out.println("Number of i: "+sc.countAllCharacters('E'));
        System.out.println("Number of upper cases: "+sc.countUpperCases());

    }
}
