package day11_stringManipulations;

import java.util.Locale;
import java.util.Scanner;

public class C04_length {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen İsminizi Giriniz");
        String isim=scan.nextLine();
        System.out.println("basharf : "+isim.toUpperCase(Locale.forLanguageTag("tr")).charAt(0));
        System.out.println("son harf : "+isim.toUpperCase(Locale.forLanguageTag("tr")).charAt(isim.length()-1));

         String str1="";
        System.out.println(str1.length());

    }
}
