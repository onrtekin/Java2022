package kendiCalismam3;

import java.util.Scanner;

public class C09_lastInddexOf {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle=scan.nextLine();
        System.out.println("Lutfen bir harf giriniz");
        char harf=scan.next().charAt(0);
        int sayi=cumle.lastIndexOf(harf);
        if(sayi==-1){
            System.out.println("harf cumlede yoktur");
        }else {
            System.out.println("harf cumlede vardir");
        }



    }
}
