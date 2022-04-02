package day07_ifElseStatements;

import java.util.Scanner;

public class C05_IfElse {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir tamsayi giriniz");
        int sayi= scan.nextInt();

        if (sayi%2==0){
            System.out.println("cift sayidir");
        } else {
            System.out.println("tek sayidir");

        }


    }
}
