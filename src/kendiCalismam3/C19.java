package kendiCalismam3;

import java.util.Scanner;

public class C19 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("100'den kucuk bir tamsayi giriniz");
        int sayi=scan.nextInt();

        for (int i = 1; i <=sayi ; i++) {
            if(i%3==0||i%5==0){
                System.out.print(i+" ");
            }

        }





    }
}
