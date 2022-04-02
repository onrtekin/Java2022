package day03_scanner;

import java.util.Scanner;

public class C12_Scanner {
    public static void main(String[] args) {
        // karenin bir kenar uzunlugunu isteyerek,karenin alani ve cevresini vermek

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen karenin bir kenar uzunlugunu giriniz");
        int kenarUzunlugu= scan.nextInt();
        System.out.println("Karenin alani : "+ kenarUzunlugu*kenarUzunlugu+ ", Karenin Cevresi : "+ kenarUzunlugu*4);


    }
}
