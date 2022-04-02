package trqateam07;

import java.util.Scanner;

public class C04_Faktoryel {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir rakam giriniz");
        int rakam=scan.nextInt();
        int toplam=1;
        for (int i = rakam; i >=1 ; i--) {
          toplam *=i;


        }
        System.out.print(toplam);


    }
}
