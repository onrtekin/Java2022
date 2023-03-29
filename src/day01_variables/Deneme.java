package day01_variables;

import java.util.Scanner;

public class Deneme {

        public static void main(String[] args) {
            // Soru 4- Kullanicidan toplanmak uzere pozitif tamsayilar isteyin, Kullaniciya bitirmek
            // istediginde 0'a basmasini soyleyin
            // Kullanici bitirmek istediginde toplam kac adet pozitif tam sayi girdiginive
            // bunlarin toplaminin kac oldugunu yazdirin
            // Kullanici negatif sayi girerse "negatif sayi kullanamazsiniz " yazdirin bu
            // negatif sayiyi sayi adedine ve toplama eklemeyin
            Scanner scan = new Scanner(System.in);
            int toplam = 0;
            int girilenSayi = scan.nextInt();
            int sayiAdedi = 0;
            while (girilenSayi != 0) {
                System.out.println("Lutfen pozitif sayi giriniz" +
                    "\nBitirmek istediginizde 0'a basiniz");
                girilenSayi = scan.nextInt();
                toplam+=girilenSayi;
                sayiAdedi++;

                if (girilenSayi < 0) {
                    System.out.println("Negatif sayi kullanamazsiniz");
                    toplam-=girilenSayi;
                    sayiAdedi--;
                }
            }
            System.out.println("Girilen "+sayiAdedi+ " adet sayinin toplami : "+toplam);
        }
    }
