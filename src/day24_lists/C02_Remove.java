package day24_lists;

import java.util.ArrayList;
import java.util.List;

public class C02_Remove {
    public static void main(String[] args) {
        List<String> isimler = new ArrayList<String>();

        isimler.add("Aykut");
        isimler.add("Yusuf");
        isimler.add("Ilker");
        isimler.add("Oguzhan");
        System.out.println(isimler);
        boolean sonuc=isimler.remove("Oguzhan");//true

        sonuc=isimler.remove("Berk");
        if(sonuc==true){
            System.out.println("istediginiz isim silindi");
        }else{
            System.out.println("istediginiz isim listede olmadigi icin silenemedi");
        }
       //remove index yazdigimizda silinmeme ihtimali kalmaz
        //bize remove edilen elementi doner

        System.out.println(isimler.remove(1));
        System.out.println(isimler);

    }
}
