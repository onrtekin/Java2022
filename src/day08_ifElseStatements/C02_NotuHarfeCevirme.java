package day08_ifElseStatements;

import java.util.Scanner;

public class C02_NotuHarfeCevirme {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen Notunuzu Giriniz");
        double notSayi=scan.nextDouble();

        if (notSayi<0 || notSayi>100){
            System.out.println("Lutfen Gecerli Bir Not Giriniz");
        }
        else if(notSayi<50){
            System.out.println("Notunuz D");

        }else if(notSayi<60){
            System.out.println("Notunuz C");
        }else if(notSayi<80){
            System.out.println("Notunuz B");
        }else {
            System.out.println("Notunuz A");

        }

    }
}
