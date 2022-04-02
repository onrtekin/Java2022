package day07_ifElseStatements;

import java.util.Scanner;

public class C21_IfElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Maas Teklifinizi Yaziniz");

        int maas = scan.nextInt();

        if (maas >= 80000) {
            System.out.println("Kabul Ediyorum");
        }
        if (maas < 80000 && maas > 60000) {
            System.out.println("Konusabiliriz");
        }
        if (maas < 60000 || maas == 60000) {
            System.out.println("Malesef Kabul Edemem");
        }


    }
}
