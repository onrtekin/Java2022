package trqateam07;

import java.util.Scanner;

import static trqateam07.C01_StringTerstenYazdirma.terstenYazdir;

public class C02_Palindrome {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir String giriniz");
        String str=scan.nextLine();
        String tersKelime="";


        for (int i = str.length()-1; i >=0 ; i--) {
            tersKelime+=str.substring(i,i+1);

        }

        if(tersKelime.equalsIgnoreCase(str)) {
            System.out.println("Girdiginiz ifadenin tersi : "+tersKelime+": bu bir palindrom'dur");
        }else{
            System.out.println("Girdiginiz ifadenin tersi : "+tersKelime+": bu bir palindrom degildir");
        }





    }
}
