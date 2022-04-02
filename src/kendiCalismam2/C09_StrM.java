package kendiCalismam2;

import java.util.Scanner;

public class C09_StrM {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen Bir Cumle Giriniz");
        String cumle=scan.nextLine();
        System.out.println("Lutfen Bir Kelime Giriniz");
        String kelime= scan.next();
        int index=cumle.indexOf(kelime);
        if(index<0){
            System.out.println("Girilen kelime cumlede kullanilmamis");
        }else if(cumle.indexOf(kelime, index+1)<0){
            System.out.println("Bir kere kullanilmis");
        }else{
            System.out.println("Birden fazla kullanilmis");
        }


    }
}
