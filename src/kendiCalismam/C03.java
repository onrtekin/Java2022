package kendiCalismam;

import java.util.Scanner;

public class C03 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen boyunuz \'cm\' cinsinden giriniz");

        int boy=scan.nextInt();
        if(boy<=175){
            System.out.println("\'Kısa Boylusunuz\'");
        }else if(boy>175){
            System.out.println("\"Uzun Boylusunuz\"");
        }

    }
}
