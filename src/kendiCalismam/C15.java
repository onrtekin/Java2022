package kendiCalismam;

import java.util.Scanner;

public class C15 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen mail adresinizi giriniz");
        String mail=scan.next();
        if(mail.indexOf("@")==(-1)){
            System.out.println("gecersiz");
        }else{
            System.out.println("kabul");
        }



    }

}
