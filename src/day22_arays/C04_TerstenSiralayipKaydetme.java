package day22_arays;

import java.util.Arrays;

public class C04_TerstenSiralayipKaydetme {
    public static void main(String[] args) {

        int arr[]={3,5,6,7,1,9,45,25,4,9,0};
       arr=terstenSiraliHaleCevir(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("en buyuk eleman "+arr[0]);
        System.out.println("en kucuk eleman "+arr[arr.length-1]);



    }

    public static int[] terstenSiraliHaleCevir(int[] arr) {
        Arrays.sort(arr);
        int tersArr[]=new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            tersArr[i]=arr[arr.length-1-i];



        }

        return tersArr;

    }
}
