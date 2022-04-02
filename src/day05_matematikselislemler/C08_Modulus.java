package day05_matematikselislemler;

import java.util.Scanner;

public class C08_Modulus {
    public static void main(String[] args) {

        // kullanicidan alinan 4 basamakli sayinin rakamlari toplamini bulma

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen 5 haneli bir tamsayi giriniz");

        int sayi= scan.nextInt();
        int rakam=0;
        int rakamlarToplami=0;

        rakam=sayi%10;
        rakamlarToplami =rakam;
        sayi/=10;

        rakam=sayi%10;
        rakamlarToplami +=rakam;
        sayi/=10;

        rakam=sayi%10;
        rakamlarToplami +=rakam;
        sayi/=10;

        rakam=sayi%10;
        rakamlarToplami +=rakam;
        sayi/=10;

        rakam=sayi%10;
        rakamlarToplami +=rakam;
        sayi/=10;

        System.out.println("Girdiginiz sayinin rakamlar toplami : "+ rakamlarToplami);




    }
}
