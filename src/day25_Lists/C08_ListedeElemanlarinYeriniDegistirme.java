package day25_Lists;

import java.util.ArrayList;
import java.util.List;

public class C08_ListedeElemanlarinYeriniDegistirme {
    public static void main(String[] args) {


        //verilen bir listede istenen 2 indeksteki elentlerin yerini
        //kalici olarak degistiren bir method olusturun
        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(1);
        sayilar.add(7);
        int ilkIndex=2;
        int ikinciIndex=5;
        sayilar=swapElements(sayilar,ilkIndex,ikinciIndex);



    }
int temp=0;
    public static List<Integer> swapElements(List<Integer> sayilar, int ilkIndex, int ikinciIndex) {
        //bir temp sayi olusturup
        //verilen indexlerdeki sayilari yer degistirin
        //indexleri kontrol edip sinirin otesinde indeks verildiyse uyari mesaji yazdirin
        if(ilkIndex>sayilar.size()&&ikinciIndex>sayilar.size()){
            System.out.println("girdiginiz index degerleri sinirin disinda");
        }
        sayilar.add(1,ilkIndex);
        sayilar.add(2,ikinciIndex);


        System.out.println(sayilar);

        return sayilar;
    }
}
