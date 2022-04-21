package day50_maps;

import day49_maps.MapOlustur;

import java.util.*;

public class C01_Maps {
    public static void main(String[] args) {
        // siniftaki ogrenci listesini duzenli olarak yazdiralim

        Map<Integer,String> sinifList=MapOlustur.myMap();
        System.out.println(sinifList);
        /*
        key lere tek tek ulasmak istersek index paisina iytiyac var
        map index yapisini desteklemez bu yuzden map i once sete daha sonrada setin
        butun elementlerini Listge atiyoruz...

         */
        Set<Integer> sinifKeySeti=sinifList.keySet();
       List<Integer> keyList=new ArrayList<Integer>();
        keyList.addAll(sinifKeySeti);
        System.out.println(keyList);

        // simdide value leri index ile ulasabilecek bir sekle sokalim
        Collection<String> sinifValueColl=sinifList.values();
        System.out.println(sinifValueColl.size());
        List<String>valueList=new ArrayList<String>();
        valueList.addAll(sinifValueColl);
        System.out.println(valueList);
        /*
        her bir value birden fazla bilgiyi iceriyor onun icin
        valu leri multidimensional bir array e atmak mantikli duruyor

        */

        int outerArrayBoyut=valueList.size();
        // inner arrayin boyutunu bulmak biraz daha komplex

        String ilkValue=valueList.get(0);
        System.out.println(ilkValue);
        String ilkValueArray[]=ilkValue.split(", ");
        int innerArrayBoyut=ilkValueArray.length;

        String valueMDArr[][]=new String[outerArrayBoyut][innerArrayBoyut];
        for (int i = 0; i <outerArrayBoyut ; i++) {
            String temp[]=valueList.get(i).split(", ");
            for (int j = 0; j <innerArrayBoyut ; j++) {
               valueMDArr[i][j]=temp[j];

            }

        }
        /*
        bu satira kadar key leri index ile ulasabildigimiz keyList e atadik
        value leri valueMDArr e atadik
        bu key ve value leri istedigimiz gibi manipule edebiliriz
        */
        System.out.println("Numara Isim Soyisim Brans");
        System.out.println("=========================");
        for (int i = 0; i < keyList.size(); i++) {
            System.out.print( keyList.get(i)+"   ");
            for (int j = 0; j <innerArrayBoyut ; j++) {
                System.out.print(valueMDArr[i][j]+"  ");
            }
            System.out.println("");
        }

    }
}
