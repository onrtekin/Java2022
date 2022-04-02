package day30_passbyValue;

public class C04_PassByValue {

    // method da yapilan degisikligin kalici olmasini istiyorsak  iki, yontem kullanabiliriz
    //variable class levelda static olarak atayabiliriz
    static double etiketFiyati;
    static double indirimYuzdesi;

    public static void main(String[] args) {


        etiketFiyati=100;
        indirimYuzdesi=10;
        kaliciIndirimYap();


    }


    public static void kaliciIndirimYap(){

        etiketFiyati=etiketFiyati*(100-indirimYuzdesi)/100;

        System.out.println("indirimli Fiyat : "+etiketFiyati);

    }

}
