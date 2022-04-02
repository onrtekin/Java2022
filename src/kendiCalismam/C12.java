package kendiCalismam;

import java.util.Locale;
import java.util.Scanner;

public class C12 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String isim=scan.nextLine();
        System.out.println("ilk harf : "+ isim.toUpperCase(Locale.forLanguageTag("tr")).charAt(0));
        System.out.println("son harf : "+ isim.toUpperCase(Locale.forLanguageTag("tr")).charAt(isim.length()-1));


    }
}
