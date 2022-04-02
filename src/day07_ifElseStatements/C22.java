package day07_ifElseStatements;

import java.util.Scanner;

public class C22 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen Bir Karakter Giriniz");

        char karakter=scan.next().toLowerCase().charAt(0);

        if(Character.isDigit(karakter)){
            System.out.println("Girdiginiz Karakter Rakamdir");

        }else if(Character.isLetter(karakter)){
            System.out.println("Girdiginiz Karakter Harftir");
        }else{
            System.out.println("Girdiginiz Karakter Senboldur");
        }



    }
}
