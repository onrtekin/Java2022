package day03_scanner;

import java.util.Scanner;

public class C23_Scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("karenin bir kenar uzunlugunu giriniz");
        int sayi= scan.nextInt();
        System.out.println("karenin cevresi : "+ sayi*4);
        System.out.println("karenin alani : "+ sayi*sayi);
    }
}
