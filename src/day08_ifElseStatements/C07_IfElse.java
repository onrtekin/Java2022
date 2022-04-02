package day08_ifElseStatements;

import java.util.Scanner;

public class C07_IfElse {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen iki tamsayi giriniz");

        double sayi1= scan.nextDouble();
        double sayi2=scan.nextDouble();

        if (sayi1>0 && sayi2>0){
            System.out.println("Sayilarin Toplami : "+(sayi1+sayi2));
        }else if(sayi1<0&&sayi2<0){
            System.out.println("Sayilarin carpimlari : "+(sayi1*sayi2));
        }else if(sayi1*sayi2<0){
            System.out.println("Farkli isaretlerle islem yapilamaz");
        }else {
            System.out.println("sayilardan biri 0 sa sifir carpmaya gore yutan elemandir");
        }

    }


}
