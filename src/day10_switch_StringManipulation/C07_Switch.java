package day10_switch_StringManipulation;

import java.util.Scanner;

public class C07_Switch {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("\"Lutfen Bir Rakam Giriniz\"\n\'(0\\9 arasi)\'bir rakam giriniz\n\t\"Negatif Deger Girmeyiniz\"");
        int rakam=scan.nextInt();

        switch (rakam){

            case 0:
                System.out.println("Girdiginiz rakam = " + rakam);
                break;
            case 1:
                System.out.println("Girdiginiz rakam = " + rakam);
                break;
            case 2:
                System.out.println("Girdiginiz rakam = " + rakam);
                break;
            case 3:
                System.out.println("Girdiginiz rakam = " + rakam);
                break;
            case 4:
                System.out.println("Girdiginiz rakam = " + rakam);
                break;
            case 5:
                System.out.println("Girdiginiz rakam = " + rakam);
                break;
            case 6:
                System.out.println("Girdiginiz rakam = " + rakam);
                break;
            case 7:
                System.out.println("Girdiginiz rakam = " + rakam);
                break;
            case 8:
                System.out.println("Girdiginiz rakam = " + rakam);
                break;
            case 9:
                System.out.println("Girdiginiz rakam = " + rakam);
                break;

            default:
                System.out.println("Lutfen gecerli bir rakam giriniz");



        }



    }
}
