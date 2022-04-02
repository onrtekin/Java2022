package day11_stringManipulations;

import java.util.Scanner;

public class C03_equalsIgnorcase {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Derse Katilmak İstiyormusunuz");
        String cevap=scan.next();
        if(cevap.equalsIgnoreCase("evet")) {
            System.out.println("cevabiniz = " + cevap + " derse katiliminiz onaylanmistir");
        }else if(cevap.equalsIgnoreCase("hayir")){
            System.out.println("cevabiniz = " + cevap+" Sonraki Derslerimize bekleriz");
        }else{
            System.out.println("Lutfen evet veya hayir yaziniz");
        }


    }
}
