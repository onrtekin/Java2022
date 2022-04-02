package day08_ifElseStatements;

import java.util.Scanner;

public class C09_IfElse {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen Sifrenizi Giriniz");
        String sifre= scan.next();
        if (sifre.charAt(0)=='A'||sifre.charAt(0)=='z'){
            System.out.println("Gecerli Sifre");

        }else{
            System.out.println("Gecersiz Sifre");
        }



    }





}
