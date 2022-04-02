package day26_foreachLoop_Constructor;

import java.util.Arrays;

public class C01_ForEachLoop {
    public static void main(String[] args) {

        int arr[]={2,4,6,8,11};
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");



        // for-each loop ile
        // hedef bir collection vermeliyiz

        for (int each : arr
             ) {

            System.out.print(each+" ");

        }
        System.out.println("");

        System.out.println(Arrays.toString(arr));




    }
}
