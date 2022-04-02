package day30_passbyValue;

public class C05_PassByValue {

    public static void main(String[] args) {
        double etiketFiyati=100;
        double indirimYuzdesi=10;
        etiketFiyati=kaliciIndirimYap(etiketFiyati,indirimYuzdesi);
        System.out.println("main method da indirim sanrasi : "+etiketFiyati);


    }
    public static double kaliciIndirimYap(double etiketFiyati,double indirimYuzdesi){

        etiketFiyati=etiketFiyati*(100-indirimYuzdesi)/100;

        System.out.println("indirimli Fiyat : "+etiketFiyati);
return etiketFiyati;
    }


}
