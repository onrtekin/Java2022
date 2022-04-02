package day07_ifElseStatements;

import java.util.Scanner;

public class C30_GunSayisi {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen Birinci Tarihi Girininiz");
        long tarih1= scan.nextLong();
        System.out.println("Lutfen İkinci Tarihi Giriniz");
        long tarih2= scan.nextLong();
        if(tarih1>tarih2&&tarih1>0&&tarih2>0){
            System.out.println("İki Tarih Arasinda : "+((tarih1-tarih2)*365));
        }else if(tarih2>tarih1&&tarih2>0&&tarih1>0){
            System.out.println("İki Tarih Arasinda : "+((tarih2-tarih1)*365));
        }else if(tarih1==tarih2){
            System.out.println("Verdiginiz Tarihler Aynidir");
        }else if(tarih1<0||tarih2<0){
            System.out.println("Hatali Giris");
        }


    }
}
