package day49_maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C01_Maps {
    public static void main(String[] args) {
        /*
        javada collection uyesş bir yapida data turu
        object secilirse , her data turunden deger ekleyebiliriz
        fakat surekli casting problemleri ile karsilasiriz
         */



        List<Object> list=new ArrayList<>();
        list.add("Ergin");
        list.add(15);
        list.add(10.2);
        System.out.println(list);
        list.set(1,(Integer)list.get(1)+10);
        System.out.println(list);

        Map<Integer,String> sinifList=new HashMap<>();
        /*
        bir sinifta ogrenci no ve isim soysim be brans olarak map olusturmak
        istiyoruz....
        key tek bir unique degerdir
        ama value yani deger birden fazla bilginin birlesiminden olusabilir bu durumda daha sonra
        istedigimiz bilgilere dogru sekilde ulasabilmek icin tum
        elementler icin value ayni bicimde olusturulmalidir.
       (veri siralamasi ve sekilsel acidan)
         */

        sinifList.put(101,"Ali, Can, Dev");
        sinifList.put(102,"Veli, Yan, QA");
        sinifList.put(103,"Ali, Yan, C#");
        System.out.println(sinifList);
        System.out.println(sinifList.keySet());
        System.out.println(sinifList.values());

    }
}
