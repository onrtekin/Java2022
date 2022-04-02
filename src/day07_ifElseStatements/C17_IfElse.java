package day07_ifElseStatements;

import java.util.Scanner;

public class C17_IfElse {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen Ucgenin Birinci Kenar Uzunlugunu Giriniz");
        int kenarBir= scan.nextInt();
        Scanner scan1=new Scanner(System.in);
        System.out.println("Lutfen Ucgenin İkinci Kenar Uzunlugunu Giriniz");
        int kenarIki= scan.nextInt();

        Scanner scan2=new Scanner(System.in);
        System.out.println("Lutfen Ucgenin Ucuncu Kenar Uzunlugunu Giriniz");
        int kenarUc= scan.nextInt();

        if ((kenarBir==kenarIki)&&(kenarBir==kenarUc)){
            System.out.println("Eskenar Ucgen");

        }else {
            System.out.println("Eskenar Degil");
        }
    }
}
