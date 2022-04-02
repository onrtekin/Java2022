package day19_doWhileLoop;

import java.util.Scanner;

public class C04_DoWhileLoop {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int sayi=0;
        int toplam=0;
        int negatiSayac=0;
        int pozitifSayac=0;

        do{

            System.out.println("Lutfen pozitif bir tamsayi giriniz \nbitirmek icin 0'a basiniz");
            sayi=scan.nextInt();
            if(sayi<0){
                System.out.println("negatif sayi giremezsiniz");
                negatiSayac++;
            }else if(sayi>0){
                toplam+=sayi;
                pozitifSayac++;
            }



        }while (sayi!=0);
        System.out.println("yanlislikla girilen negatif sayi adedi : "+negatiSayac);
        System.out.println("girilen pozitif sayi adedi : "+pozitifSayac);
        System.out.println("girilen sayilarin toplami : "+toplam);


    }
}
