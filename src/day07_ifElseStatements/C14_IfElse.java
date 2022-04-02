package day07_ifElseStatements;

import java.util.Scanner;

public class C14_IfElse {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir Gun Ismi Giriniz");
        String gun= scan.next().toLowerCase();
        if (gun.equals("cuma")){
            System.out.println("Muslumanların Kutsal Gunudur");
        }
        if (gun.equals("cumartesi")){
            System.out.println("Yahudilerin Kutsal Gunudur");

        }
        if (gun.equals("pazar")){
            System.out.println("Hristiyanlarin Kutsal Gunudur");
        }
    }
}
