package day04_dataCasting_Increment;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        // kullanicinin ismini alip 1i harfini yazdir

        System.out.println("Lutfen isminizi giriniz");
        char ilkHarf=scan.next().charAt(1);


        // charAt(index) methodu parametre olarak yazdigimiz indexdeki char getirir




        System.out.println("Girdiginiz ismin ikinci harfi : "+ ilkHarf);







    }
}
