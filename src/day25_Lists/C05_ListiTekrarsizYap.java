package day25_Lists;

import java.util.ArrayList;
import java.util.List;

import static day25_Lists.C04_ListedenTekrarliElemanlariSilme.tekrarsizListeOlustur;

public class C05_ListiTekrarsizYap {
    public static void main(String[] args) {
        // verilen bir listede tekrar eden sayilari sadece bir kere yazdiran bir tane yapan olusturun

        //orn [1,3,5,3,5,6,1,7]
        //output: [1,3,5,6,7]
        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(1);
        sayilar.add(7);

        sayilar=tekrarsizListeOlustur1(sayilar);
        System.out.println(sayilar);

    }

    private static List<Integer> tekrarsizListeOlustur1(List<Integer> sayilar) {
        List<Integer> tekrarsiz=new ArrayList<>();
        for (int i = 0; i <sayilar.size() ; i++) {
            if(!tekrarsiz.contains(sayilar.get(i))){
                tekrarsiz.add(sayilar.get(i));
            }

        }
        return tekrarsiz;
    }
}
