package kendiCalismam;

import java.util.Scanner;

public class C07 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen Yil Giriniz");
        int yil=scan.nextInt();

        if(yil%4!=0){
            System.out.println("Artik Yil Degildir");
        }else if(yil%4==0&&yil%100!=0){
            System.out.println("Artik Yildir");
        }else if(yil%400==0){
            System.out.println("Artik Yildir");
        }else{
            System.out.println("Artik Yil Degildir");
        }






    }
}
