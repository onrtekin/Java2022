package day08_ifElseStatements;

import java.util.Scanner;

public class C05_IfElseStatements {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen Bir Karakter Giriniz");
        char karakter=scan.next().charAt(0);

        if (karakter>='A'&&karakter<='Z'||karakter>='a'&&karakter<='z'){
            System.out.println("Girdiginiz karakter harftir ");

        }else {
            System.out.println("Girdiginiz Karakter Harf Degildir");
        }




    }
}
