package kendiCalismam3;

import java.util.Scanner;

public class C07_indexOf {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir cumle giriniz");
        String cumle=scan.nextLine();
        System.out.println("Lutfen bir harf giriniz");
        char harf=scan.next().charAt(0);
        int deger=cumle.indexOf(harf);
        if(deger==-1){
            System.out.println("Girdiginiz harf cumlede bulunmamaktadir");
        }else{
            System.out.println("Girdiginiz harf cumlede bulunmaktadir");
        }



    }
}
