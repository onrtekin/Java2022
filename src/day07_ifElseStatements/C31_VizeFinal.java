package day07_ifElseStatements;

import java.util.Scanner;

public class C31_VizeFinal {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen Vize Notunuz Giriniz");

        int vizeNotu= scan.nextInt();

        System.out.println("Lutfen Final Notunuzu Giriniz");

        int finNotu= scan.nextInt();

        double donemNotu;
        donemNotu=((finNotu*0.6)+(vizeNotu*0.4));
        if (donemNotu>=50&&finNotu>=50){
            System.out.println("Donem Notunuz : "+donemNotu+"  Gectiniz");

        }else{
            System.out.println("Donem Notunu : "+donemNotu+"  Kaldiniz");
        }








    }
}
