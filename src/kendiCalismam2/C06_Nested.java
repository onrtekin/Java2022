package kendiCalismam2;

import java.util.Scanner;

public class C06_Nested {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen 4 Basmakli Bir Sayi Giriniz");
        int sayi=scanner.nextInt();

        if(sayi%5==0){
            if(sayi%10==0){
                System.out.println("\"5'e bolunen cift sayi\"");
            }else if(sayi%10!=0){
                System.out.println("\"5'e bolunen tek sayi\"");
            }

        }



        else{
            System.out.println("Tekrar Deneyin");
        }


    }
}
