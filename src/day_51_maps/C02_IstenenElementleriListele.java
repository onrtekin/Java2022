package day_51_maps;

import day49_maps.MapOlustur;

import java.util.*;

public class C02_IstenenElementleriListele {
    public static void main(String[] args) {
        /*
        Verilen map’te istenen programlama dilini bilen kisileri list olarak donduren bir method yaziniz.
 mapè { 101=Ali, Can, java, 102=Veli, Yan, java, 103=Ali, Yan, C#}
 Istenen dil è java
 Sonuc è [Ali, Veli]
         */
        Map<Integer,String> sinifMap= MapOlustur.myMap();
        String istenenDil="C#";
        List<String> istenenDiliBilenlerListesi=istenenDiliBilenListesiOlustur(sinifMap,istenenDil);
        System.out.println(istenenDiliBilenlerListesi);


    }

    private static List<String> istenenDiliBilenListesiOlustur(Map<Integer, String> sinifMap, String istenenDil) {
        List<String>istenenDiliBilenlerListesi=new ArrayList<>();
        Collection<String> sinifValueColl=sinifMap.values();
        List<String>valueList=new ArrayList<String>();
        valueList.addAll(sinifValueColl);

        int outerArrayBoyut=valueList.size();
        String ilkValue=valueList.get(0);

        String ilkValueArray[]=ilkValue.split(", ");
        int innerArrayBoyut=ilkValueArray.length;

        String valueMDArr[][]=new String[outerArrayBoyut][innerArrayBoyut];
        for (int i = 0; i <outerArrayBoyut ; i++) {
            String temp[]=valueList.get(i).split(", ");
            for (int j = 0; j <innerArrayBoyut ; j++) {
                valueMDArr[i][j]=temp[j];

            }

        }

        for (int i = 0; i < outerArrayBoyut; i++) {
                if(valueMDArr[i][2].equals(istenenDil)){
                    istenenDiliBilenlerListesi.add(valueMDArr[i][0]);
                }
        }

        return istenenDiliBilenlerListesi;
    }


}
