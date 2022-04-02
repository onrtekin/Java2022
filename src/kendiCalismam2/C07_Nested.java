package kendiCalismam2;

import java.util.Scanner;

public class C07_Nested {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen Sifrenizi Giriniz");
        String sifre = scan.next();

        if (sifre.charAt(0) >= 'A' && sifre.charAt(0) <= 'Z') {
            if (sifre.charAt(0) == 'A') {

                System.out.println("Gecerli Sifre");
            } else {
                System.out.println("Gecersiz Sifre");
            }
        } else if (sifre.charAt(0) >= 'a' && sifre.charAt(0) <= 'z') {
            if (sifre.charAt(0) == 'z') {
                System.out.println("Gecerli Sifre");
            } else {
                System.out.println("Gecersiz Sifre");
            }

        }
    }
}
