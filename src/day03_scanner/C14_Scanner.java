package day03_scanner;

import java.util.Scanner;            // kullanicidan ismini ve soyismini alip aralarinda bir bosluk olusturarak yazdir

public class C14_Scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String isim= scan.nextLine();
        System.out.println("Lutfen soyisminizi giriniz");
        String soyisim= scan.nextLine();

        System.out.println("Ad Soyad : "+ isim + " "+ soyisim);





    }
}
