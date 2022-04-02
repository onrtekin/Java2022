package day07_ifElseStatements;

import java.util.Scanner;

public class C_11IfElse {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen Herhangi Bir Gunun İlk Harfini Giriniz");

        String harf=scan.next().toUpperCase();
        if (harf.equals("P")){
            System.out.println("PAZARTESİ, PERSEMBE, PAZAR");

        }
        if (harf.equals("S")){
            System.out.println("SALI");
        }

        if (harf.equals("C")){
            System.out.println("CARSAMBA, CUMA, CUMARTESİ");
        }

        else {

            System.out.println("Yanlis bir harf girdiniz");
        }


    }
}
