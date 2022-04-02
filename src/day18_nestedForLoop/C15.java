package day18_nestedForLoop;

import java.util.Scanner;

public class C15 {
    public static void main(String[] args) {

        int sayiAdedi=5;
        Scanner scan=new Scanner(System.in);


        int sayi=0;

        int toplam=0;


        for (int i = 1; i <=sayiAdedi ; i++) {


        }
        System.out.println("girilen "+sayiAdedi+" sayinin toplami : "+toplam);


        sayi=0;
        toplam=0;
        int sayac=1;
        while (sayac<=sayiAdedi){
            System.out.println("lutfen bir sayi giriniz");
            sayi=scan.nextInt();
            toplam+=sayi;
            sayac++;

        }System.out.println("girilen "+sayiAdedi+" sayinin toplami : "+toplam);


    }
}
