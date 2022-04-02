package day34_accesModifier_encapsulation;

public class C01 {
    private static int sayi=10;
    private static String str="Java";
    static int acikSayi=20;// acces modifier i default acces Modifier olur
    String acikStr="Hi"; // acces modifier i default acces Modifier olur
    public static int hakaAcıikSayi=15;
    protected static int aileyeOzel=40;
    protected C01(){
// bu constructor in acces Modifier i default acces Modifier dir dolayisiyla icinde oldugumuz paketin disinda
        //bu class in disinda obje olusturulamaz
    }

    private void method1(){

    }
    private C01(int numara){

        System.out.println("parametreli constructor calisti");
    }
}
