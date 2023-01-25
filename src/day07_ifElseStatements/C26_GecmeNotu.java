package day07_ifElseStatements;

import java.util.Scanner;

public class C26_GecmeNotu {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen Aldiginiz Notu Giriniz : ");

        int not= scan.nextInt();

        if(not>=50){
            System.out.println("Gectiniz");

        }else {
            System.out.println("Kaldiniz "+(50-not)+" puan daha almaniz gerekirdi");
        }



    }



}
