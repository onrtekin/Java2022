package kendiCalismam3;

import java.util.Scanner;

public class C02_lastIndexOf {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen Bir Cumle Giriniz");
        String cumle=scan.nextLine();
        System.out.println("Lutfen Bir Kelime Giriniz");
        String kelime=scan.next();
        int ilkKullanim=cumle.indexOf(kelime);
        int sonKullanim=cumle.lastIndexOf(kelime);

        if(ilkKullanim==-1){
            System.out.println("Kullanilmamistir");
        }else if(ilkKullanim==sonKullanim){
            System.out.println("1 Kere Kullanilmistir");
        }else{
            System.out.println("1'den Cok Kullanilmistir");
        }



    }
}
