package day47_linkedList;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C04_ArraydenTekrarlariSilme {
    public static void main(String[] args) {
        /*
        verilen bir Array den tekrar eden elemanlari silip
        unique elementlerden olusan bir array haline donduren bir method olusturalim
         */
        Integer arr[]={3,5,4,6,3,1,2,7,8,6,1,4,2,8};

        arr = benzersizYap(arr);


    }

    private static Integer[] benzersizYap(Integer[] arr) {
        Set<Integer> benzersizSet = new HashSet<Integer>();
        for (int i = 0; i < arr.length; i++) {
            benzersizSet.add(arr[i]);
        }
        System.out.println(benzersizSet);
        /*
        set de index yapisi yoktur dolayisi ile for lopp kullanamayiz
         */
        Integer arrBenzersiz[]=new Integer[benzersizSet.size()];
        int index=0;
        for (Integer each:benzersizSet) {
            arr[index]=each;
            index++;
        }

        return arrBenzersiz;
    }
}
