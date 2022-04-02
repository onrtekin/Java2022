package day07_ifElseStatements;

import java.util.Scanner;

public class C18_If_Else {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen Bir Karakter Giriniz");
        char karakter=scan.next().charAt(0);
        if ((karakter>='A'&& karakter<='Z')||(karakter>='a'&& karakter<='z')){
            System.out.println("Girdiginiz Harftir");
        }else {
            System.out.println("Girdiginiz Harf Degildir");
        }



    }
}
