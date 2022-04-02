package day04_dataCasting_Increment;

public class C02_AutoWidening {
    public static void main(String[] args) {

        boolean dogruMu=true;

        //String str=dogruMu;

        byte sayi1=44;

        System.out.println(sayi1);



        short sayi2=sayi1;// esitligin solu short sagi ise byte olmasina ragmen java itiraz etmiyor
        //deger olarak atanan data turu variables data turunden kucuk oldugu icin java sorun yapmaz bu auto widening

        System.out.println(sayi2);


        double sayi3=sayi2;
        System.out.println(sayi3);


    }
}
