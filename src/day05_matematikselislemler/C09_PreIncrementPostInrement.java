package day05_matematikselislemler;

import java.util.Scanner;

public class C09_PreIncrementPostInrement {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen 4 Basamakli bir tamsayi giriniz");
        int sayi= scan.nextInt();

        int rakam=0;
        int rakamlarToplami=0;

        rakam=sayi%10;
        rakamlarToplami+=rakam;
        sayi/=10;
        rakam=sayi%10;
        rakamlarToplami+=rakam;
        sayi/=10;
        rakam=sayi%10;
        rakamlarToplami+=rakam;
        sayi/=10;
        rakam=sayi%10;
        rakamlarToplami+=rakam;
        sayi/=10;
        System.out.println("Rakamlar Toplami : "+rakamlarToplami);












    }
}
