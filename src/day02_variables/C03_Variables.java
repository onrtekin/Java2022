package day02_variables;

public class C03_Variables {
    public static void main(String[] args) {

        String ogrenciIsmi="Melih";

        ogrenciIsmi="Furkan";
        System.out.println(ogrenciIsmi);

        // bir variabel declare edildikten sonra istediğimiz kadar deger degisimi yapabiliriz
        // ancak declare edilen bir variable tekrar declare edilemez
        // String ogrenciIsmi="Abdullah";

       String isim,soyisim,dogumYeri;
       isim="Nihad";
       soyisim="ozel";
       dogumYeri="Ankara";

        System.out.println(dogumYeri);
        System.out.println(isim);
        System.out.println(soyisim);


        String tcNo="1234567";

        String hiclik="0";

        System.out.println(tcNo);

        System.out.println(hiclik);

        // String non-primitive oldugu icin sadece data saklamak icin değil
        // ekstra bazi ozellikleri de kullananbiliyoruz
        // sayısal olan matematiksel bir işlemde kullanılmayan degerler icinde kullanabilir


        String harf="A";

        System.out.println(harf);

        char harf2='A';

        System.out.println(harf2);


        // bu ikisi icinde ayni durun gecerli
        // A harfi icin bir variable'i char olarakta olusturabiliriz String olarakta olusturabiliriz
        // eger sadece saklayacaksak char kullanılabilir
        // String'in ozelliklerinden istifade etmek icin String tanimlamak daha avantajli olabilir



    }
}
