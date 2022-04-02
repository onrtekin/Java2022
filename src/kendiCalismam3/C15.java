package kendiCalismam3;

import java.util.Scanner;

public class C15 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen isminizi giriniz : ");
        String isim=scan.nextLine();
        System.out.print("Lutfen soyisminizi giriniz : ");
        String soyIsim=scan.nextLine();
        if (isim.length()>soyIsim.length()){
            System.out.println("Daha uzun olan isminiz : "+isim);
        }else if(isim.length()<soyIsim.length()){
            System.out.println("Daha uzun olan soyisminiz : "+soyIsim);
        }else{
            System.out.println("İsim ve Soyisminiz esittir");
        }


    }
}
