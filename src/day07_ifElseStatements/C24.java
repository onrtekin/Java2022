package day07_ifElseStatements;

import java.util.Scanner;

public class C24 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen Herhangi Bir Gunun Ilk Harfini Giriniz");
        char ilkHarf=scan.next().toLowerCase().charAt(0);

        if(ilkHarf=='p'){

            System.out.println("pazartesi, persembe, pazar");

        }else if (ilkHarf=='s'){
            System.out.println("sali");

        }else if(ilkHarf=='c'){
            System.out.println("carsamba, cuma, cumartesi");
        }else {
            System.out.println("Hatali Giris Yaptiniz");
        }




    }



}
