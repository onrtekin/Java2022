package day07_ifElseStatements;

import java.util.Scanner;

public class C15_If {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen Bir Karakter Giriniz");

        char karakter=scan.next().charAt(0);

        if (karakter==("a").toLowerCase().charAt(0)){
            System.out.println("Girdiginiz harf");

        }
        else {
            System.out.println("Harf Degil");


        }

    }

}
