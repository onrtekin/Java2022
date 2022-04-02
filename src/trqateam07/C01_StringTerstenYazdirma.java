package trqateam07;

import java.util.Scanner;

public class C01_StringTerstenYazdirma {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen bir kelime giriniz : ");
        String str=scan.next();

        String tersKelime=terstenYazdir(str);
        System.out.println(tersKelime);



    }

    static String terstenYazdir(String str) {
        String ters="";
        for (int i = str.length()-1; i >=0 ; i--) {
            ters+=str.substring(i,i+1);

        }return ters;
    }


}
