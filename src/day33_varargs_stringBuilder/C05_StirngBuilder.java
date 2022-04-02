package day33_varargs_stringBuilder;

public class C05_StirngBuilder {
    public static void main(String[] args) {
        /*
        Compare iki sb'i ilk harften baslayharak tum karakterleri karsilastirir
        Ayni olan karakterler icin bir sey yazdirmaz
        farkli olan ilk karakter icin ascii tablosuna gore kac deger geride veya ileride oldugunu yazdirir.
        tamamen ayni olursa 0 dondurur.
        bir sb ile bir String i compare edersek Stringi kabul etmez ce cte verir.


         */
        StringBuilder sb1=new StringBuilder("Ali Can");
        StringBuilder sb2=new StringBuilder("naC ilA");
        String str="Ali Can";

        System.out.println(sb1.compareTo(sb2));
        //System.out.println(sb1.equals(sb2));
        //System.out.println(sb1.equals(sb1));
        System.out.println(sb1.equals(str));
        //System.out.println(sb1.substring(3,5));
        //System.out.println(sb1);
        System.out.println(sb1.subSequence(3,5));
        //System.out.println(sb1);


    }
}
