package kendiCalismam;

import java.util.Scanner;

public class C13 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 5 karakteri yanyana giriniz");
         String isim=scan.next();
        System.out.println(" "+"\n"+isim.charAt(isim.length()-5)+isim.charAt(isim.length()-4)+isim.charAt(isim.length()-3)+
                isim.charAt(isim.length()-2)+isim.charAt(isim.length()-1));



    }
}
