package day52_maps;

import java.util.HashMap;
import java.util.Map;

public class C03_MapMethodlari {
    public static void main(String[] args) {
        Map<String,Integer> myneMap=new HashMap<>();
        myneMap.put("H",3);
        myneMap.putIfAbsent("K",5);
        // bir ekleme yapmak istedigimizde key dah a once eklenmemisse
        //map e eklesi daha onceden eklenmisse eskiyi silmemek icin uyarsin
        System.out.println(myneMap.putIfAbsent("A",6));
        if(myneMap.putIfAbsent("K",20)!=null){
            System.out.println("girdiginiz key map te zaten var");
        }

        System.out.println(myneMap);
        myneMap.put("A",10);
        System.out.println(myneMap);
        myneMap.computeIfAbsent("A", v->20);
        System.out.println(myneMap);
        myneMap.compute("A",(key,value)->20);
        System.out.println(myneMap);
        // H'nin degerini  2 katinin 5 fazlasi yapalim
        myneMap.compute("H",(key,value)->(2*value+5));
        System.out.println(myneMap);





    }
}
