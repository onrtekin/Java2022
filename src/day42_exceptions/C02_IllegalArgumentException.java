package day42_exceptions;

import java.util.Scanner;

public class C02_IllegalArgumentException {
    public static void main(String[] args) {
        /*
        Kullanicidan yasini isteyin
        yas olarak negatif,0 veya 120 den buyuk bir sayi girerse
        illegalArgumentException olusacak sekilde bir program yazin
         */


        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen yasinizi giriniz : ");
         int yas=scan.nextInt();
         if(yas<=0||yas>120){
             //System.out.println("Lutfen gecerli bir yas giriniz");
             //java bizim istedigimiz durumlarda exception firlatabilir
             throw new IllegalArgumentException();//C02_IllegalArgumentException
         }else{
             System.out.println("Uygun yas girdiniz ");
         }


    }
}
