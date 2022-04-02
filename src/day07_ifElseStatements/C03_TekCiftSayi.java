package day07_ifElseStatements;

import java.util.Scanner;

public class C03_TekCiftSayi {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir tamsayi giriniz");
        int sayi= scan.nextInt();

        if (sayi%2==0){
            System.out.println("verilen sayi cift sayidir");

        }
        if (sayi%2 !=0){

            System.out.println("verilen sayi tek sayidir");


        }


    }
}
