package kendiCalismam;

import java.util.Scanner;

public class C16 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen bir cumle giriniz");
        String cumle=scan.nextLine();
        System.out.println("Lutfen bir harf giriniz");
        char harf=scan.next().charAt(0);
        if(cumle.indexOf(harf) != -1){
            System.out.println("girdiginiz harf cumlede bulunmaktadir");
        }else{
            System.out.println("bulunmamaktadir");
        }



    }
}
