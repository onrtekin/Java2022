package day07_ifElseStatements;

import java.util.Scanner;

public class C19_IfElse {
    public static void main(String[] args) {

        Scanner scan1=new Scanner(System.in);
        System.out.println("Lutfen Birinci Tamsayiyi Giriniz");

        int sayi1=scan1.nextInt();

        Scanner scan2=new Scanner(System.in);
        System.out.println("Lutfen İkinci Tamsayiyi Giriniz");
        int sayi2=scan1.nextInt();

        if (sayi1>0 && sayi2>0){
            System.out.println("Sayilarin toplami : "+sayi1+sayi2);

        }
        if (sayi1<0 && sayi2<0){
            System.out.println("Sayilarin Carpimlari : "+sayi1*sayi2);

        }
        if (sayi1<0 && sayi2>0||sayi1>0 && sayi2<0){
            System.out.println("Farkli Isaretlerde Sayilarda Islem Yapamazsiniz");


        }
        if (sayi1==0 || sayi2==0){
            System.out.println("0 Carpmaya Gore Yutan Elemandir");

        }


    }
}
