package day07_ifElseStatements;

import java.util.Scanner;

public class C25 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen Bir Yil Giriniz");
        int yil= scan.nextInt();
        if(yil%4==0){
            System.out.println("Girdiginiz Yil Atik Yildir Subat Ayi 29 Ceker");

        }else {
            System.out.println("Girdiginiz Yil Atik Yil Degildir Subat Ayi 28 Ceker");
        }

    }
}
