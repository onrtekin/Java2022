package day40_overriding_polymorphism;

import java.util.Scanner;

public class C03_Exceptions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int kontrol=0;
        while(kontrol!=2){
            System.out.print("Bolmek istediginiz sayiyi yaziniz : ");
            int sayi1= scan.nextInt();
            System.out.print("Kaca bolmek istediginizi yaziniz : ");
            int sayi2=scan.nextInt();

            try {
                System.out.println("sonuc = " + sayi1 / sayi2);
            } catch (Exception e) {
                //e.printStackTrace();
                System.out.println("girdiginiz sayilar sorunlu");
            }
            System.out.println("devam etmek icin 1\nbitirmek icin 2 basin");
            kontrol=scan.nextInt();
        }


         /*
         sayi2 0 oldugunda sayi1/sayi2 tanimsiz oldugundan java bu durumda exception verir.
         javanin yazdigi mesajda exception un ne tur bir sebep oldugu neden kaynaklandigi
         ve hangi satirda olustugu yazar.
         Bunu cozmek icin sayi2 yi if ile kontrol edebiliriz...


         if(sayi2==0){
             System.out.println("Sayi / 0 tanimsizdir");
         }else {
             System.out.println("sonuc = " + sayi1 / sayi2);
         }
         ama bu yontem her durumda calismaz...
          */
    }
}
