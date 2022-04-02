package day25_Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C06_ArraydenListOlusturma {
    public static void main(String[] args) {
        //verilen bir array i list e cevir

        String arr[]={"A","B","C"};
        List<String> arraydenlist = Arrays.asList(arr);

        System.out.println(arraydenlist);

        arr[1]="F";
        System.out.println(Arrays.toString(arr));
        System.out.println(arraydenlist);
        arraydenlist.set(0,"Y");
        System.out.println(Arrays.toString(arr));
        System.out.println(arraydenlist);

    }
}
