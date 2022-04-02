package kendiCalismam3;

import java.util.Scanner;

public class C14 {


    public static void main(String[] args) {



        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen mail adresinizi giriniz");
        String email=scan.nextLine();
        String arananMetin="@hotmail.com";
        if(!email.contains(arananMetin)){
            System.out.println("Lutfen hotmail.com adresi giriniz");
        }else if(email.endsWith(arananMetin)){
            System.out.println("mail adresiniz kaydedildi");
        }else {
            System.out.println("kontrol ediniz");
        }


    }

}
