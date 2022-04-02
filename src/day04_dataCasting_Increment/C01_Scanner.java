package day04_dataCasting_Increment;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminiz giriniz....");
        char ilkHarf=scan.next().charAt(0);
                // charAt indeks metodu parametre olarak yazdigimiz char getirir.
        //Stringde indeks 0 dan baslar
        System.out.println("girdiginiz ismin ilk harfi : "+ ilkHarf);

    }
}
