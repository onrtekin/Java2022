package kendiCalismam2;

import java.util.Scanner;

public class C08_StrM {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir cumle yaziniz");
        String cumle=scan.nextLine();
        System.out.println("Lutfen bir harf giriniz");
        char harf=scan.next().charAt(0);

        if(cumle.indexOf(harf)!=-1){
            System.out.println("harf cumlede mevcut");
        }else{
            System.out.println("Harf cumlede mevcut degil");
        }


    }
}
