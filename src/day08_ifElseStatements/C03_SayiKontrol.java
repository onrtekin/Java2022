package day08_ifElseStatements;

import java.util.Scanner;

public class C03_SayiKontrol {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen Iki Sayi Giriniz");
        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();

        if (sayi1>0 && sayi2>0){
            System.out.println("Girdiginiz İki Sayıda Pozitif Oldugundan toplamlari  : "+(sayi1+sayi2));
        }else if(sayi1<0 && sayi2<0){
            System.out.println("Girdiginiz İki Sayıda Negatif Oldugundan carpimlari  : "+(sayi1*sayi2));

        }else if(sayi1*sayi2<0){
            System.out.println("Farkli Isaretlerle Islem Yapamazsin");
        }else {
            System.out.println("Sifir Carpmaya Gore Yutan Elemandir");
        }




    }
}
