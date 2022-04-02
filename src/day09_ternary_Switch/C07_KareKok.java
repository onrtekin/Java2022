package day09_ternary_Switch;

import java.util.Scanner;

public class C07_KareKok {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");

        double sayi=scan.nextInt();
        double karekokSayi=Math.sqrt(sayi);
        int tamSayi=(int)karekokSayi;
        double tekrarKarekokSayi=tamSayi;
        if(tekrarKarekokSayi-karekokSayi==0){
            System.out.println("Girdiginiz sayinin karekoku : "+tamSayi);
        }else{
            System.out.println("Girdiginiz sayinin karekoku bir tamsayi degildir");
        }


    }
}
