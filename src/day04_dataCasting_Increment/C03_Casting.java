package day04_dataCasting_Increment;

public class C03_Casting {
    public static void main(String[] args) {
        int sayi1=8;
        int sayi2=4;
        System.out.println(sayi1/sayi2);

        sayi2=3;
        System.out.println(sayi1/sayi2);

        sayi1=22;
        System.out.println(sayi1/sayi2);
        // java 2 int sayiyi biribirine bolerse sonucuda int verir yuvarlama yapmaz
        sayi1=4786;
        sayi2=10;
        sayi1=sayi1/sayi2;
        System.out.println(sayi1);

        sayi1=sayi1/sayi2;
        System.out.println(sayi1);

        sayi1=sayi1/sayi2;
        System.out.println(sayi1);

        sayi1=sayi1/sayi2;
        System.out.println(sayi1);

        // iki farkli sayi data turune isleme koydugumuzda java kucuk olan data turu icin autoWidening yapar.







    }
}
