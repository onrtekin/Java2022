package day21_arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {
        String arr1[]={"Ali","Veli","Ayse"};

        //array icindekilere ulasmak icin index kullanir
        System.out.println(arr1[0]);
        arr1[1]="Esila";
        System.out.println(arr1[1]);
// index kullanarak elementlere ulasabilir ve update edebiliriz.

        int arr2[]=new int[4];
        System.out.println(arr2[1]);//0
        System.out.println(arr2[3]);//0
      //  System.out.println(arr2[5]);// sinirlarin disina cikiyor.

        //array in tamamini yazdirmak istersek
        System.out.println(arr2);//[I@511baa65 referans degerini yazdirir, array ler non primitive oldugundan
        //direk yazdirmak istersek java referans bilgisini yazdirir.


       // for (int i = 0; i < 4; i++) {
         //   System.out.print(arr2[i]+"-");
           // System.out.println(" ");


            //arrayi yazdirmak icin javadaki arrays class indan toString[] metodu kullaniriz.
            System.out.println(Arrays.toString(arr2));
     arr2[1]=11;
     arr2[3]=22;

        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr1));




        }



    }

