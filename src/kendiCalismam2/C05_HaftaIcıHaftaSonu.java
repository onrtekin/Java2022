package kendiCalismam2;

import java.util.Scanner;

public class C05_HaftaIcıHaftaSonu {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen Bir Gun Yaziniz");

        String gun=scan.next().toUpperCase();

        switch (gun){

            case "PAZARTESİ":
                System.out.println("Haftaici");
                break;
            case "SALİ":
                System.out.println("Haftaici");
                break;
            case "CARSAMBA":
                System.out.println("Haftaici");
                break;
            case "PERSEMBE":
                System.out.println("Haftaici");
                break;
            case "CUMA":
                System.out.println("Haftaici");
                break;
            case "CUMARTESİ":
                System.out.println("Haftasonu");
                break;
            case "PAZAR":
                System.out.println("Haftasonu");
                break;
            default:
                System.out.println("Gecerli bir gun giriniz");
        }



    }
}
