package day08_ifElseStatements;

import java.util.Scanner;

public class C04_Emeklilik {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi yaziniz" +
                "\nKadin icin K \nErkek icin E harfini giriniz");

        char cinsiyet = scan.next().toUpperCase().charAt(0);
        System.out.println("Lutfen yasinizi giriniz");
        double yas = scan.nextDouble();

        if (cinsiyet == 'K') {
            if (yas < 0 || yas > 120) {
                System.out.println("girdiginiz degeri kontrol ediniz");
            } else if (yas < 60) {
                System.out.println("Emekli olamazsin \nDaha " + (60 - yas) + " yil calismaniz gerekir");
            } else {
                System.out.println("Emekli olabilirsin");
            }

        } else if (cinsiyet == 'E') {
            if (yas < 0 || yas > 120) {
                System.out.println("girdiginiz degeri kontrol ediniz");
            } else if (yas < 65) {
                System.out.println("Emekli olamazsin \nDaha " + (65 - yas) + " yil calismaniz gerekir");
            } else {
                System.out.println("Emekli Olabilirsin");
            }

        } else {
            System.out.println("Gecerli bir harf giriniz");
        }

    }
}
