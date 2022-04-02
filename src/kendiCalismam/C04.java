package kendiCalismam;

import java.util.Scanner;

public class C04 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen Birinci Sayiyi Giriniz");
        int sayi1=scan.nextInt();
        System.out.println("Lutfen İkinci Sayiyi Giriniz");
        int sayi2=scan.nextInt();
        System.out.println("Lutfen Ucuncu Sayiyi Giriniz");
        int sayi3=scan.nextInt();
        if(sayi1>sayi2&&sayi1>sayi3){
            System.out.println("Girdiginiz En Buyuk Sayi : "+sayi1);
        }else if(sayi2>sayi1&&sayi2>sayi3){
            System.out.println("Girdiginiz En Buyuk Sayi : "+sayi2);
        }else if(sayi3>sayi1&&sayi3>sayi2){
            System.out.println("Girdiginiz En Buyuk Sayi : "+sayi3);
        }


    }
}
