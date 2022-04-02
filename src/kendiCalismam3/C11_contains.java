package kendiCalismam3;

import java.util.Scanner;

public class C11_contains {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen email adresinizi giriniz");
        String email = scan.nextLine();
        String arananMetin = "@gmail.com";

        if (!email.contains(arananMetin)) {
            System.out.println("Lutfen gmail adresi giriniz");
        } else if (email.lastIndexOf(arananMetin) == (email.length() - 10)) {
            System.out.println("mail adresiniz kaydedildi");
        }else{
            System.out.println("Yazimi kontrol edin");
        }

    }
}
