package kendiCalismam3;

import java.util.Scanner;

public class C03_contains {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen email adresinizi giriniz");
        String email=scan.nextLine();

        String aranan="@gmail.com";
        if(!email.contains(aranan)){
            System.out.println("Lutfen gmail adresi giriniz");
        }else if(email.lastIndexOf(aranan)==(email.length()-10)){
            System.out.println("email adrsiniz kaydedildi");
        }else{
            System.out.println("Kontrol ediniz");
        }


    }
}
