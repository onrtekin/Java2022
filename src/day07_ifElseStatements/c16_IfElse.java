package day07_ifElseStatements;

import java.util.Scanner;

public class c16_IfElse {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen Yasinizi Giriniz");

        int yas= scan.nextInt();

        if (yas>=65){
            System.out.println("Emekli Olabilirsiniz");
        }
        else if ((yas<65)&&(yas>20)){
            System.out.println("Emekli Olamazsiniz : "+ (65-yas)+" Yil Daha Calismalisiniz");

        } else {
            System.out.println("Sigorta Sistemine Kaydiniz Yapilmamistir");
        }

    }
}
