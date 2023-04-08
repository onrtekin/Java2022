package day03_scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen aldiginiz urun adedini giriniz");
        int urunSayisi = scan.nextInt();
        System.out.println("Lutfen liste fiyatini giriniz");
        double listeFiyati = scan.nextDouble();
        System.out.println("Musteri kartiniz var midir?");
        char musteriKarti= scan.next().charAt(0);
        if (musteriKarti=='V' || musteriKarti=='v' && urunSayisi>=10){
            System.out.println("%20 indirim kazandiniz. yeni liste fiyatinizi: "+ (80*listeFiyati/100));
        } else if (musteriKarti=='V' || musteriKarti=='v' && urunSayisi<10) {
            System.out.println("%15 indirim kazandiniz. yeni liste fiyatiniz: "+ (85*listeFiyati/100));
        } else if (musteriKarti=='Y' || musteriKarti=='y' && urunSayisi>=10) {
            System.out.println("%15 indirim kazandiniz. yeni liste fiyatiniz: "+ (85*listeFiyati/100));
        } else if (musteriKarti=='Y' || musteriKarti=='y' && urunSayisi<10) {
            System.out.println("%10 indirim kazandiniz. yeni liste fiyatiniz: "+ (90*listeFiyati/100));
        } else {
            System.out.println("gecersiz bilgiler girilimistir.\nlutfen bilgilerinizi kontrol edip tekrar deneyiniz");
        }
    }





    }
