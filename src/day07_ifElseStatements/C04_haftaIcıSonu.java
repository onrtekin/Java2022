package day07_ifElseStatements;

import java.util.Scanner;

public class C04_haftaIcıSonu {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir gun ismi yaziniz");

        String gun=scan.next().toLowerCase();

        if (gun.equals("pazar")|| gun.equals("cumartesi")){
            System.out.println("girdiginiz gun haftasonu");
        }

        if (gun.equals("pazartesi")|| gun.equals("sali")||gun.equals("carsamba")||gun.equals("persembe")||
                gun.equals("cuma")){
            System.out.println("girdiginiz gun haftaici");

        }

    }
}
