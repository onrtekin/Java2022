package day06_concatenaion_Operators;

import java.util.Scanner;

public class C06_IfCalisma2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int sayi1= scan.nextInt();
        if (sayi1 %2==0) {
            System.out.println("Girdiginiz sayi cift sayidir");

        }
        if (sayi1 %2!=0){

            System.out.println("Girdiginiz sayi tek sayidir");
        }


    }
}
