package day22_arays;

import java.util.Arrays;

public class C03_BuyuktenKucugeSiralama {
    public static void main(String[] args) {

        //verilen bir arrayi buyukten kucuge siralayip yazdiran bir metod olusturun

        int arr[]={3,5,6,7,1,9,45,25,4,9,0};
        System.out.println("ilk hali "+Arrays.toString(arr));
        terstenSiralaYazdir(arr);





    }

    public static void terstenSiralaYazdir(int[] arr) {
        Arrays.sort(arr);
        System.out.println("sirali hali   "+Arrays.toString(arr));
        int tersArr[]=new int[arr.length];
        System.out.println(" bos olusturdugumuz hali   "+Arrays.toString(tersArr));
        for (int i = 0; i < arr.length; i++) {
            tersArr[i]=arr[arr.length-1-i];



        }

        System.out.println("son hali    "+Arrays.toString(tersArr));
    }
}
