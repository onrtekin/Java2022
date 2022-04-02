package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C05_Arrays {
    public static void main(String[] args) {

        //verilen bir array e yeni bir element ekleyen bir method olusturun.
        int  arr[]={3,5,7};
       // arr[3]=8; olmayan bir indexe atama yapamayiz.
       // arr={1,3,5}; varolan bir array e ayni boyutta bile olsa direk yeni degerler iceren  atama yapamayiz

        arr=new int[4];
        System.out.println(Arrays.toString(arr));


        int arrYeni[]=new int[5];
        arr=arrYeni;
        System.out.println(Arrays.toString(arr));
        arrYeni[0]=2;
        arrYeni[3]=5;
        arr=arrYeni;

        System.out.println(Arrays.toString(arr));

        int arrEnYeni[]={1,2,3,4,5};
        arr=arrEnYeni;
        System.out.println(Arrays.toString(arr));

    }
}
