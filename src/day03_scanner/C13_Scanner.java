package day03_scanner;

import java.util.Scanner;

public class C13_Scanner {
    public static void main(String[] args) {
        // sayi1 ve sayi2 girilmesini isteyelim
        // daha sonra bu sayilarin carpimlarinin sonuclarini verelim

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen birinci sayiyi giriniz");

        int sayi1= scan.nextInt();

        System.out.println("Lutfen ikinci sayiyi giriniz");
        int sayi2= scan.nextInt();

        System.out.println("İki sayinin carpimlari : "+ sayi1*sayi2 );

    }
}
