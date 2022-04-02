package day18_nestedForLoop;

import java.util.Scanner;

public class C17 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);


        int sayi=0;

        int toplam=0;


        while(toplam<500){
            System.out.println("lutfen bir sayi giriniz");
            sayi=scan.nextInt();
            toplam+=sayi;

        }
        System.out.println("yeter girdiginiz sayilarin toplami "+toplam+" oldu");
    }

}
