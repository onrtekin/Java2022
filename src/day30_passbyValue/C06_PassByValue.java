package day30_passbyValue;

import java.util.Arrays;

public class C06_PassByValue {

    public static void main(String[] args) {
        //non primitive data turlerinde objenin kendisi degilde icindeki elementler degisirse
        //java objenin referansi ve objenin

        int arr[]={1,2,3};
        System.out.println(Arrays.toString(arr));
        arrDegistir(arr);
        System.out.println("method sonrasi : "+Arrays.toString(arr));

    }

    private static void arrDegistir(int[] arr) {
        arr[0]=5;
        arr[1]=6;
        System.out.println(Arrays.toString(arr));

    }


}
