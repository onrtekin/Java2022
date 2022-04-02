package day12_stringManipulation;

import java.util.Scanner;

public class C06_ReplaceAll {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen Isim Soyisminizi Giriniz");
        String isimSoyisim=scan.nextLine();
        System.out.println(isimSoyisim.replaceAll("\\S","*"));


    }
}
