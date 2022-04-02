package day05_matematikselislemler;


import java.util.Scanner;

   public class C03_RakamlarToplaminiBulma {
       public static void main(String[] args) {
           Scanner scan=new Scanner(System.in);
           System.out.println("Lutfen 4 basamakli bir tamsayi giriniz");
           int sayi=scan.nextInt();
           // modulus


           int rakam=0;
           int rakamlarToplami=0;

           rakam=sayi%10;
           rakamlarToplami +=rakam;


           rakam=sayi%10;
           rakamlarToplami +=rakam;
           rakam=sayi%10;
           rakamlarToplami +=rakam;
           rakam=sayi%10;
           rakamlarToplami +=rakam;





           System.out.println(rakamlarToplami);



       }



    }

