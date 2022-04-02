package day18_nestedForLoop;

import java.util.Random;
import java.util.Scanner;

public class C18_SayiBulmaca {

    public static void main(String[] args) {



        Random rnd=new Random();
        int sayi=rnd.nextInt(100);


        Scanner scan=new Scanner(System.in);
        int tahmin=0;
        int sayac=0;





     while(tahmin!=sayi){

         System.out.println("lutfen bir sayi giriniz");
         tahmin=scan.nextInt();

         if(tahmin>sayi){
             System.out.println("girdiginiz sayi buyuk eksiltin");


         }else if(sayi>tahmin){
             System.out.println("girdiginiz sayi kucuk buyultun");

         }
         sayac++;


     }
        System.out.println("sayiyi "+sayac+" denemede buldunuz ");


    }
}
