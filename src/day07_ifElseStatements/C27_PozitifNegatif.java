package day07_ifElseStatements;

import java.util.Scanner;

public class C27_PozitifNegatif {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen Bir Sayi Giriniz");
        int sayi= scan.nextInt();

        if(sayi>0){
            System.out.println("Girdiginiz Sayi Pozitif Sayidir");
        }else if(sayi<0){
            System.out.println("Girdiginiz Sayi Negatif Sayidir");
        }else {
            System.out.println("Girdiginiz Sayi 0'dir.Nötr'dur.");
        }

    }



}
