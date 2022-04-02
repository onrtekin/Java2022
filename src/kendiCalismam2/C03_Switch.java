package kendiCalismam2;

import java.util.Scanner;

public class C03_Switch {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen Bir Sayi Giriniz");
        int sayi=scan.nextInt();

        switch (sayi) {

            case 10:
                System.out.println("\'İki Basamakli En Kucuk Sayi\'");
                break;
            case 100:
                System.out.println("\'Uc Basamakli En Kucuk Sayi\'");
                break;
            case 1000:
                System.out.println("\'Dort Basamakli En Kucuk Sayi\' ");
                break;
                default:
                    System.out.println("\"Girdigin Sayiyi Degistir");





        }


    }
}
