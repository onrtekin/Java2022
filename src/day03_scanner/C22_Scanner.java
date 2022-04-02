package day03_scanner;

import java.util.Scanner;

public class C22_Scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi degeri giriniz");
        int tamsayi1= scan.nextInt();
        System.out.println("Lutfen ikinci tamsayiyi giriniz");
        int tamsayi2= scan.nextInt();
        System.out.println("iki sayinin carpimlari"+" "+tamsayi1*tamsayi2);
    }
}
