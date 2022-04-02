package kendiCalismam3;

import java.util.Scanner;

public class C01_lastIndexOf {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen Bir Cumle Giriniz");
        String cumle=scan.nextLine();
        System.out.println("Lutfen Bir Kelime Giriniz");
        String kelime=scan.next();
        if(cumle.lastIndexOf(kelime)==-1){
            System.out.println("Kullanilmamistir");
        }else{
            System.out.println("Kullanilmistir");
        }



    }
}
