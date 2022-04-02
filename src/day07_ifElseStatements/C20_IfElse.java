package day07_ifElseStatements;

import java.util.Scanner;

public class C20_IfElse {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen Aldiginiz Puani Giriniz");

        int not= scan.nextInt();

        if (not<50&&not>0){
            System.out.println("Harf Notunuz : D");
        }
        if (not>=50&&not<60){
            System.out.println("Harf Notunuz : C ");

        }

        if (not>=60&&not<80){
            System.out.println("Harf Notunuz : B");
        }

        if (not>=80&&not<101){
            System.out.println("Harf Notunuz : A");
        }

        if (not>100||not<0){
            System.out.println("Hatali Giris Yaptiniz");
        }


    }
}
