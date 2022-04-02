package kendiCalismam3;

import java.util.Scanner;

public class C08_indexOf {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle = scan.nextLine();
        System.out.println("Lutfen bir kelime giriniz");
        String kelime = scan.next();
        int ilkKullanim = cumle.indexOf(kelime);
        int sonrakiKullanim = cumle.indexOf(kelime, ilkKullanim + 1);
        if (ilkKullanim == -1) {
            System.out.println("kelime cumlede kullanilmamistir");
        } else if (sonrakiKullanim ==-1) {
            System.out.println("kelime bir kere kullanilmis");
        }else{
                System.out.println("kelime birden fazla kullanilmis");
            }

        }

    }

