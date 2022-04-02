package kendiCalismam3;

import java.util.Scanner;

public class C04_contains {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle=scan.nextLine();
        String arananBuyuk="buyuk";
        String arananKucuk="kucuk";
        if(cumle.contains(arananBuyuk)){
            System.out.println(cumle.toUpperCase());
        }else if(cumle.contains(arananKucuk)){
            System.out.println(cumle.toLowerCase());
        }else{
            System.out.println("Cumle kucuk yada buyuk kelimesi icermiyor");
        }

    }
}
