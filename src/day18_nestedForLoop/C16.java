package day18_nestedForLoop;

import java.util.Scanner;

public class C16 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);


        int sayi=0;

        int toplam=0;
        for (int i = 0; i < 100000; i++) {
            System.out.println("lutfen bir sayi giriniz");
            sayi=scan.nextInt();
            if(sayi==0){
                break;
            }else {
                toplam+=sayi;
            }
        }

        System.out.println(toplam);


        sayi=1;
        toplam=0;
        while(sayi!=0){
            System.out.println("lutfen bir sayi giriniz");
            sayi=scan.nextInt();
            toplam+=sayi;


        }
        System.out.println(toplam);
    }
}
