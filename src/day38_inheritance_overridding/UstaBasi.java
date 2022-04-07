package day38_inheritance_overridding;

public class UstaBasi extends Isci {
    public String statu = "Ustabasi";
    public String haklar = "Ustabasi haftada 1 gun ekstra tatil hakkina sahiptir";



    public void mesai() {
        System.out.println("Ariza varsa ekstra calisir");
    }

    public void maasHesapla() {
        System.out.println("Ustabasi 30 gun * 8 saat * 10 euro = " + (30 * 8 * 12) + " euro maas alir");
    }

    public static void main(String[] args) {
        /*
        icinde oldugumuz class tan klasik haliyle bir obje olusturursak o obje ile cagirdigimiz variable ve
        method larda java obce icinde bulundugumuz class a bakar
        eger varsa bize onu getirir
        yoksa parent class lara bakar ilk bulduguna bakar
         */
        UstaBasi yasin = new UstaBasi();
        System.out.println(yasin.statu);//Ustabasi
        System.out.println(yasin.haklar);//Ustabasi haftada 1 gun ekstra tatil hakkina sahiptir
        System.out.println(yasin.ikramiye);//Iscler yilda 1 ikramiye alir
        System.out.println(yasin.izin);//Tum personel yilda 4 hafta izin kullanabilir
        yasin.maasHesapla();
        yasin.mesai();

        /*
        eger isci olarak ozelliklerini gormek istersek
        Class adini Isci seceriz
         */
        Isci ahmet = new UstaBasi();
        System.out.println(ahmet.statu);//Isci
        System.out.println(ahmet.haklar);//Isciler kidem tazminati alirlar
        System.out.println(ahmet.ikramiye);//Iscler yilda 1 ikramiye alir
        System.out.println(ahmet.izin);//Tum personel yilda 4 hafta izin kullanabilir
        ahmet.maasHesapla();
        ahmet.mesai();
        /*
        Bir objeyi hangi classtan tanimlarsaniz o class a ait
        ozelliklere sahip olur
         */

        Personel adem = new UstaBasi();
        System.out.println(adem.statu);//Personel
        System.out.println(adem.haklar);//Tum personel esit haklara sahiptir
        //System.out.println(adem.ikramiye);//CTE
        System.out.println(adem.izin);//Tum personel yilda 4 hafta izin kullanabilir
        adem.maasHesapla();
        adem.mesai();


        /*
        Personel adem = new UstaBasi(); ustabasi objesi
        Personel adem = new Personel();personel objesi
        */
        /*
        Personel adem = new UstaBasi();
        ademin data turu personel dir.
        Boylece biz adem i ne olarak isimlendirdigimizi bilebiliriz
        Ancak ben adem in ustabasi oldugunu biliyolrum cunku construstor i ustabasi
        ama bu olusturma formati ile tum Personel ile birlikte sahip oldugu ortak ozellikleri
        vurgulamak istiyorum.
        Bu kullanim seklinde olusturulan obje, data turu olarak secilen class ve onun parent class larindaki
        variable lari kullanabilir.
         */


    }
}
