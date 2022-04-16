package day46_iterator_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C01_iterator {
    public static void main(String[] args) {
        List<Integer> liste = new ArrayList<>();
        liste.add(5);
        liste.add(7);
        liste.add(8);
        liste.add(6);
        liste.add(9);
        System.out.println(liste); // [5, 7, 8, 6, 9]

        Iterator itr = liste.iterator();// liste objesi uzerinden ArrayList Class indan calistiriyoruz
        /*
        iterator nasil calisir
        bir iterator objesi olusturmak icin collection uyesi bir obje kullanmaliyiz
        [(itr)5, 7, 8, 6, 9]
        iterator objesini liste objesi uzerinde calismak icin olusturmus olduk...
        iterator objesini ousturdugumuzda iterator collection in ilk elementinin oncesine gidip bekler

        [(itr)5, 7, 8, 6, 9]

        itr.hasNext()===>true iterator a yaninda eleman var mi diye sorar true false dondurur
        itr.next();==>iterator bir sonraki elementin yanina gecer uzerinden gectigi elementi biz dondurur
        [5,(itr) 7, 8, 6, 9]==>5 dondurur

           itr.remove(); iterator in elinde olan elementi sildi
           ust uste 2 kere itr.remove() kullanilamaz
           once itr.next();methodunu kullanarak iteratorin bir eleman almasini saglamaliyiz



         */
        System.out.println(itr.hasNext());//true
        System.out.println(itr.next());//5
        System.out.println(itr.next());//7
        itr.remove();
        System.out.println(liste);
       // itr.remove();




    }
}