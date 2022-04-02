package day07_ifElseStatements;

import java.util.Scanner;

public class C13_IfElse {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Seklin Uzun Kenar Uzunlugunu Giriniz");

        int sayi1= scan.nextInt();

        Scanner scan1=new Scanner(System.in);
        System.out.println("Seklin Kisa Kenar Uzunlugunu Giriniz");
        int sayi2=scan1.nextInt();

        if (sayi1==sayi2){
            System.out.println("Bu Sekil Karedir");
        }
        else {
            System.out.println("Bu Sekil Dikdortgendir");

        }


    }
}
