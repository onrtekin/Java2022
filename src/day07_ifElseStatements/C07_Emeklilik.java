package day07_ifElseStatements;

import java.util.Scanner;

public class C07_Emeklilik {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen Yasinizi giriniz");
        int yas= scan.nextInt();

        if (yas>=65){
            System.out.println("Emekli Olabilirsiniz");

        }
        else {
            System.out.println("Emekli Olamazsiniz");
            System.out.println(65-yas+ " sene daha calismalisiniz");


        }


    }
}
