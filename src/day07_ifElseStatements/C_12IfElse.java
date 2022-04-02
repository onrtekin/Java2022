package day07_ifElseStatements;

import java.util.Scanner;

public class C_12IfElse {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen Bir Gun Ismi Griniz");

        String gunIsmi= scan.next().toLowerCase();

        if (gunIsmi.equals("pazartesi")){
            System.out.println("Girdiginiz Gun Haftaicidir");



        }
        if (gunIsmi.equals("sali")){
            System.out.println("Girdiginiz Gun Haftaicidir");



        }
        if (gunIsmi.equals("carsamba")){
            System.out.println("Girdiginiz Gun Haftaicidir");



        }
        if (gunIsmi.equals("persembe")){
            System.out.println("Girdiginiz Gun Haftaicidir");



        }
        if (gunIsmi.equals("cuma")){
            System.out.println("Girdiginiz Gun Haftaicidir");



        }
        if (gunIsmi.equals("cumartesi")){
            System.out.println("Girdiginiz Gun Haftasonudur");



        }
        if (gunIsmi.equals("pazar")) {
            System.out.println("Girdiginiz Gun Haftasonudur");


        }

    }
}
