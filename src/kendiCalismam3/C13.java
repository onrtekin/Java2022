package kendiCalismam3;

import java.util.Scanner;

public class C13 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle=scan.nextLine();
        String buyuk="buyuk";
        String kucuk="kucuk";
        if(cumle.contains(buyuk)){
            System.out.println(cumle.toUpperCase());
        }else if(cumle.contains(kucuk)){
            System.out.println(cumle.toLowerCase());
        }else{
            System.out.println("Cumle \'kucuk\' yada \'buyuk\' kelimesi icermiyor");
        }


    }
}
