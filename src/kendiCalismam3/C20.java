package kendiCalismam3;

import java.util.Scanner;

public class C20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir String giriniz");
        String str = scan.nextLine();


        String yeniKelime=terstenKelimeYaz(str);
        System.out.println(yeniKelime);


    }

    private static String terstenKelimeYaz(String str) {

        String tersKelime="";
        for (int i = str.length() - 1; i >= 0; i--) {


            tersKelime+=str.substring(i, i + 1);

        }return tersKelime;


    }
}