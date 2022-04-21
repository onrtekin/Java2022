package day49_maps;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

public class C02_ListeyiDuzenliYazdirma {
    public static void main(String[] args) {
        //sinif listesini duzenli bir sekilde yazdirmak

        Map<Integer,String> sinif=MapOlustur.myMap();
        System.out.println(sinif);

        sinifListYazdir(sinif);

    }

    public static void sinifListYazdir(Map<Integer, String> sinif) {
        System.out.println("Numara Isim Soyisim Brans");
        System.out.println("=========================");
        /*
        map yapisinda yazdirdigimizda kullanilar birsey anlayamayabilir
        bunun icin once map yapisini kodlarla manipule edip datalari istedigimiz
        format sokmak gerekir
        1.adim: key ve value lari map ten alip
        iki farkli collection uyesine atadik
         */
        Set<Integer>keySet=sinif.keySet();
       Collection<String> valueSet=sinif.values();
        System.out.println(keySet);
        System.out.println(valueSet);
        System.out.println(valueSet.size());
        for (String each:valueSet) {
            System.out.println(each);
        }


    }
}
