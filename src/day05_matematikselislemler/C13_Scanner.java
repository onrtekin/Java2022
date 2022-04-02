package day05_matematikselislemler;

import java.util.Scanner;

public class C13_Scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Prizmanin uzun kenar uzunlugunu veriniz : ");
        int kenarSayi= scan.nextInt();



        Scanner scan1=new Scanner(System.in);
        System.out.println("Prizmanin yuksekligini veriniz : ");
        int yukseklikSayi=scan1.nextInt();

        Scanner scan2=new Scanner(System.in);
        System.out.println("Prizmanin kisa kenar uzunlugunu giriniz : ");
        int kisaKenar=scan2.nextInt();

        System.out.println("Prizmanin hacmi : "+kenarSayi*kisaKenar*yukseklikSayi);







    }
}
