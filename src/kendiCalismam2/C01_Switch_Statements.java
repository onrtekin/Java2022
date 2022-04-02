package kendiCalismam2;

import java.util.Scanner;

public class C01_Switch_Statements {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Haftanin kacinci gunu oldugunu giriniz");
        int kacinciGun=scan.nextInt();

        switch (kacinciGun) {
            case 1:
                System.out.println("Haftanin birinci gunu : "+"\"Pazartesi\"");
                break;
            case 2:
                System.out.println("Haftanin ikinci gunu : "+"\"Sali\"");
                break;
            case 3:
                System.out.println("Haftanin ucuncu gunu : "+"\"Carsamba\"");
                break;
            case 4:
                System.out.println("Haftanin dorduncu gunu : "+"\"Persembe\"");
                break;
            case 5:
                System.out.println("Haftanin besinci gunu : "+"\"Cuma\"");
                break;
            case 6:
                System.out.println("Haftanin altinci gunu : "+"\"Cumartesi\"");
                break;
            case 7:
                System.out.println("Haftanin Yedinci gunu : "+"\"Pazar\"");
                break;

            default:
                System.out.println("Gecerli Rakam Giriniz");
        }


    }
}
