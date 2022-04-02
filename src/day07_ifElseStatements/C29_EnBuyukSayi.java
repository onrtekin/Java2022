package day07_ifElseStatements;

import java.util.Scanner;

public class C29_EnBuyukSayi {
    public static void main(String[] args) {
        Scanner scan1=new Scanner(System.in);
        System.out.println("Lutfen Birinci Sayiyi Giriniz");
        double sayi1=scan1.nextInt();
        System.out.println("Lutfen İkinci Sayiyi Giriniz");
        double sayi2=scan1.nextInt();
        System.out.println("Lutfen Ucuncu Sayiyi Giriniz");
        double sayi3=scan1.nextInt();
        if(sayi1>sayi2&&sayi1>sayi3){
            System.out.println("Girdiginiz En Buyuk Sayi : "+sayi1);
        }else if(sayi2>sayi1&&sayi2>sayi3){
            System.out.println("Girdiginiz En Buyuk Sayi : "+sayi2);
        }else {
            System.out.println("Girdiginiz En Buyuk Sayi : "+sayi3);
        }

    }
}
