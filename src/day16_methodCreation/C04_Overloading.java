package day16_methodCreation;

import static day15_methoCreation.C06_MethodCreation.ikiSayiTopla;

public class C04_Overloading {
    public static void main(String[] args) {
        int sayi1=10;
        int sayi2=20;
        ikiSayiyiTopla(sayi1,sayi2);

        double sayi3=15.2;
        double sayi4=10.3;
        ikiSayiyiTopla(sayi3,sayi4);
        
    ikiSayiyiTopla(15,25);
    ikiSayiyiTopla(10.1,12.3);

    int sayi5=3;
    double sayi6=3.2;
    ikiSayiyiTopla(sayi5,sayi6);
        
    }

    private static void ikiSayiyiTopla(double sayi3, double sayi4) {
        System.out.println("iki dooble toplami : "+(sayi3+sayi4));
    }

    private static void ikiSayiyiTopla(int sayi1, int sayi2) {
        System.out.println("iki integer toplami : "+(sayi1+sayi2));
    }
}
