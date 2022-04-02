package kendiCalismam;


import java.util.Scanner;

public class C05 {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen Sifrenizi Giriniz");
        String sifre=scan.nextLine();
        if(sifre.charAt(0)=='A') {
            System.out.println("Gecerli Sifre");
        }else if(sifre.charAt(0)=='z') {
            System.out.println("Gecerli Sifre");
        }
        else {
            System.out.println("Gecersiz Sifre");
        }



    }

}
