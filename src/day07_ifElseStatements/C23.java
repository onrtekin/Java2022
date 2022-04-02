package day07_ifElseStatements;

import java.util.Locale;
import java.util.Scanner;

public class C23 {
    public static void main(String[] args) {
        Scanner scan1=new Scanner(System.in);
        System.out.println("Musteri Kartina Sahipmisiniz (Evet/Hayir) Lutfen");

        String musteriKarti= scan1.next().toLowerCase();

        Scanner scan2=new Scanner(System.in);
        System.out.println("Almak Istediginiz Urunun Fiyatini Giriniz");
        int urunFiyati= scan2.nextInt();

        Scanner scan3=new Scanner(System.in);
        System.out.println("Lutfen Kac Adet Urun Almak Istediginizi Giriniz");

        int adet= scan3.nextInt();

        if (musteriKarti.equals("evet")&&adet>10){
            System.out.println("Tebrikler Yuzde 20 Indirim Kazandiniz  "+"Toplam Fiyat : "+(urunFiyati*adet*0.80));


        }else if (musteriKarti.equals("hayir")&&adet<10){
            System.out.println("Tebrikler Yuzde 15 Indirim Kazandiniz  "+"Toplam Fiyat : "+(urunFiyati*adet*0.85));
        }


    }
}
