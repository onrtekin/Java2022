package day03_scanner;

import com.sun.jdi.request.MonitorContendedEnteredRequest;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen isminizi yaziniz");
        String isim=scan.nextLine();
        System.out.println("Lutfen soyisminizi giriniz");
        String soyIsim= scan.nextLine();

        System.out.println("Lutfen mail adresinizi giriniz");
        String mailAdresi=scan.nextLine();
        System.out.println("Telefon numaranizi giriniz");
        String telefonNumarasi=scan.nextLine();
        System.out.println("T.C. Numaranizi Giriniz");
        String tcNumarasi=scan.nextLine();
        System.out.println("Lutfen Medeni Halinizi Griniz");
        String medeniHali= scan.nextLine();



        System.out.println("Isim Soyisim" + " "+ isim + " "+ soyIsim);
        System.out.println("T.C. Numarasi"+ " "+ tcNumarasi);
        System.out.println("Medeni Hali"+ " "+ medeniHali);
        System.out.println("Telefon No:"+ " "+ telefonNumarasi);
        System.out.println("Email Adres"+ " "+ mailAdresi);


    }
}
