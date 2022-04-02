package day07_ifElseStatements;

import java.util.Scanner;

public class C10_TekCift {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int sayi= scan.nextInt();

        if (sayi%2==0){
            System.out.println("Grdiginiz tamsayi cift sayidir");


        }else {
            System.out.println("Girdiginiz tamsayi tek sayidir");
        }




    }

}
