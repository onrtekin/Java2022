package day05_matematikselislemler;

import java.util.Scanner;

public class C12_Scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Dairenin yaricapini giriniz : ");
        double sayi= scan.nextDouble();
        System.out.println("Dairenin cevresi : "+2*3.14*sayi);
        System.out.println("Dairenin alani : "+3.14*sayi*sayi);

    }
}
