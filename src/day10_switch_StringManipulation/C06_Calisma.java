package day10_switch_StringManipulation;

import java.util.Scanner;

public class C06_Calisma {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen Bir Kelime Giriniz");

        String kelime=scan.next();

        System.out.println("Girmis oldugunuz Kelimenin son harfi   : "+(kelime.charAt(kelime.length()-1)) );

    }
}
