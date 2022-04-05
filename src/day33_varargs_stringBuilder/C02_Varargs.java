package day33_varargs_stringBuilder;

public class C02_Varargs {
    public static void main(String[] args) {
        //paramatre olarak bir int ve istedigimiz kadar string alan en uzun kelimenin
        //harf sayisi ile int parametre degerini carpip sonucu yazdiran saonucu yazdiran
        //bir method



        int sayi=5;
        String str1="Zulal";
        String str2="Zeynep";

        carpim(sayi,str1,str2);
//bir method da varargs disinda paramatre kullanacaksak once diger parametreleri yazip varargsi
        //en sona yazmaliyiz
// bu sebeple biğr methodda birden fazla varargbs olamaz



    }
//EN KISA OLANI YAPPPPP
    private static void carpim(int sayi, String... str) {
        String enUzunStr="";
        for (String each: str) {
            if(each.length()>enUzunStr.length()){
                enUzunStr=each;
            }
        }
        System.out.println("istenen deger : "+(enUzunStr.length()*sayi));
    }
}
//Bu sebeple bir methodda birden fazla varargs olamaz.
//Bir constructor'da birden fazla this() olmaz
//Bir class'ta birden fazla main olmaz...