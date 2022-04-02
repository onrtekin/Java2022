package day03_scanner;

import java.util.Scanner;

public class C24_Scanner {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen adinizi giriniz");
        String ad= scan.nextLine();
        System.out.println("Lutfen Soyadinizi giriniz");
        String soyad= scan.nextLine();
        System.out.println("Ad Soyad : "+ " "+ ad+" "+ soyad);

    }
}

