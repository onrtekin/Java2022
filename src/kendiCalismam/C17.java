package kendiCalismam;

import java.util.Scanner;

public class C17 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle=scan.nextLine();
        System.out.println("Lutfen bir kelime giriniz");
        String kelime=scan.next();
        int index=cumle.indexOf(kelime);


        if(index<0){
            System.out.println("girilen kelime cumlede kullanilmamis");
        }else if(cumle.indexOf(kelime,index+1)<0){
            System.out.println("girdiginiz kelime cumlede 1 kere kullanilmistir");
        }else{
            System.out.println("girdiginiz kelime 1 den fazla kullanılmistir");
        }

    }
}
