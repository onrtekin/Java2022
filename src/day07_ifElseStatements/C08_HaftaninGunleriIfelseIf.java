package day07_ifElseStatements;

import java.util.Locale;
import java.util.Scanner;

public class C08_HaftaninGunleriIfelseIf {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir gun ismi girirniz");
        String gunIsmi= scan.next().toLowerCase();

        if (gunIsmi.equals("pazar")|| gunIsmi.equals("cumartesi")){
            System.out.println("Girdiginiz Gun Haftasonu");
        } else if (gunIsmi.equals("pazartesi")|| gunIsmi.equals("sali")||gunIsmi.equals("carsamba")||gunIsmi.equals("persembe")||
                gunIsmi.equals("cuma")){
            System.out.println("Girdiginiz Gun Haftaici");
        }else {
            System.out.println("Gecerli Bir Gun Giriniz");

        }

    }
}
