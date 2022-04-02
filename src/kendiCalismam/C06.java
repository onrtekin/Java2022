package kendiCalismam;

import java.util.Scanner;

public class C06 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 4 Basamakli Bir Sayi Giriniz");
        int sayi=scan.nextInt();
        if(sayi%5==0){
            if(sayi%10==0){
                System.out.println("5'e bolunen cift sayi");
            }else if(sayi%10!=0){
                System.out.println("5'e bolunen tek sayi");
            }

        }else {
            System.out.println("Tekrar Deneyin");

        }



    }
}
