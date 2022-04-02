package day26_foreachLoop_Constructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_ForEachLoop {
    public static void main(String[] args) {

        String array1[]={"Ali","Ayse","Can","Fatma"};
        System.out.println(Arrays.toString(array1));
        String array2[]={"Can","Evren","Emsal","Fatma","Emre"};
        System.out.println(Arrays.toString(array2));
        List<String> ortakElemanlar=new ArrayList<String>();


        for (String each1: array1
             ) {
            for (String each2: array2
                 ) {
                if(each2.equals(each1)){
                    ortakElemanlar.add(each2);
                }

            }

        }

        if(ortakElemanlar.isEmpty()){
            System.out.println("ortak eleman yok");
        }else{
            System.out.println("ortak elemanlar : "+ortakElemanlar);
        }



    }
}
