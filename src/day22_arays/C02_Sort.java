package day22_arays;

import java.util.Arrays;

public class C02_Sort {
    public static void main(String[] args) {

        int arr[]={3,5,6,7,0,25,4,9,0};//sort metodu almadan yapalim
        int enKucukSayi=Integer.MAX_VALUE;
        int enBuyukSayi=Integer.MIN_VALUE;
                for(int i=0; i<arr.length; i++) {
                    if (arr[i] < enKucukSayi) {
                        enKucukSayi = arr[i];
                    }

                    if (arr[i] > enBuyukSayi){
                        enBuyukSayi = arr[i];
                    }

                }


        System.out.println("en kucuk sayi"+enKucukSayi);
        System.out.println("en buyuk sayi"+enBuyukSayi);





    }
}
