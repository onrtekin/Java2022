package day08_ifElseStatements;

import java.util.Scanner;

public class C10_IfElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("4 Basamakli Sifrenizi Giriniz");

        int sayi = scan.nextInt();
        if (sayi % 5 == 0){

        }



        else if (sayi % 10 == 0) {
                System.out.println("5'e Bolunebilen Cift Sayi");

        } else if (sayi % 10 != 0) {
            System.out.println("5'e Bolunebilen Tek Sayi");
        }

        else {
            System.out.println("Tekrar Deneyin");
        }

    }
    }

