package day07_ifElseStatements;

import java.util.Scanner;

public class C06_IfElsehaftaninGunleri {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir gun ismi girirniz");
        String gun= scan.next().toUpperCase();

        if (gun.equals("PAZAR")||gun.equals("CUMARTESİ")){
            System.out.println("Hafta sonudur");

        }
        else {
            System.out.println("Hafta icidir");
        }

    }
}
