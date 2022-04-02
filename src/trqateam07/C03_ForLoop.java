package trqateam07;

import java.util.Scanner;

public class C03_ForLoop {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen birinci sayiyi giriniz : ");
        int sayi1=scan.nextInt();
        System.out.print("Lutfen ikinci sayiyi giriniz : ");
        int sayi2=scan.nextInt();

      int buyukNumara=0;
      int kucukNumara=0;
      int toplamSonuc=0;

      if(sayi1>sayi2){
          buyukNumara=sayi1;
          kucukNumara=sayi2;
      }else{
          buyukNumara=sayi2;
          kucukNumara=sayi1;
      }
        for (int i = kucukNumara; i <=buyukNumara; i++) {
            toplamSonuc+=i;
        }
        System.out.println("girdiginiz sayilar ve arsindaki sayilarin toplami : "+toplamSonuc);
    }
}
