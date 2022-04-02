package day25_Lists;

import java.util.Arrays;

public class C02_Array {
    public static void main(String[] args) {

        //verilen bir array den istenen elementi silip kalanlari yeni bir
        //array olarak olusturan yazdiran bir method olusturun

        int arr[]={3,4,2,3,5,7,3,8,5,2,4};
        int istenmeyenEleman=3;
        istenmeyenElementiSil(arr,istenmeyenEleman);

    }

    public static void istenmeyenElementiSil(int[] arr, int istenmeyenEleman) {
   int sayac=0;
   //istenmeyen eleman sayisi bulma
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==istenmeyenEleman)
            sayac++;

        }
        // yeni array i olusturalim
        int arrYeni[]=new int[arr.length-sayac];

        //eski arry den uygun elementleri tasi
        int index=0;

        for (int i = 0; i < arr.length; i++) {

            if(arr[i]!=istenmeyenEleman){
                arrYeni[index]=arr[i];
                index++;


            }

        }
        //listeyi yazdiriyoruz
        System.out.println(Arrays.toString(arrYeni));


    }
}
