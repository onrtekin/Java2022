package kendiCalismam3;

import java.util.Scanner;

public class C10_lastIndexOf {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle=scan.nextLine();
        System.out.println("Lutfen bir kelime giriniz");
        String kelime=scan.next();
        int ilkKullanim=cumle.indexOf(kelime);
        int ikinciKullanim=cumle.lastIndexOf(kelime);
        if(ilkKullanim==-1){
            System.out.println("girdiginiz kelime cumlede yoktur");
        }else if(ilkKullanim==ikinciKullanim){
            System.out.println("bir kere kullanilmis");
        }else{
            System.out.println("birden fazla kullanilmis");
        }



    }
}
