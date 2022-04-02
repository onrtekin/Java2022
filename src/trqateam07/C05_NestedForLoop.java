package trqateam07;

import java.util.Scanner;

public class C05_NestedForLoop {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir rakam giriniz");
        int sayi=scan.nextInt();

        for (int i = 0; i <=sayi ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }




    }
}
