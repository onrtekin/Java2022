package day30_passbyValue;

public class C03_PassByValue {

    public static void main(String[] args) {


        // java passbyvalue programa dilidir
        // bir variable iargument olarak yollarsaniz java o variable i degil degerini
        //method a yollar, yani buna pass by value denir.


        double etiketFiyati=100;
        yuzdeOnIndirimYap(etiketFiyati);
        yuzdeOnIndirimYap(etiketFiyati);
        System.out.println("iki indirimden sonra main method da : "+etiketFiyati);

    }

    public static void yuzdeOnIndirimYap(double etiketFiyati) {
        etiketFiyati=etiketFiyati*0.9;
        System.out.println("yuzde 10 indirimli fiyatimiz : "+etiketFiyati);
    }
}
