package day28_consructor;

public class StaticKeywords {
    static int sayi1;
    int sayi2;



    public static void main(String[] args){


        System.out.println("sayi1 :"+sayi1);
        //System.out.println("sayi2 : "+sayi2); stastic olmadigi icin kullanilamaz
        StaticKeywords obj1=new StaticKeywords();
        System.out.println(obj1.sayi2);
        sayi1++;
        obj1.sayi2++;

        System.out.println("sayi1 :"+sayi1);
        System.out.println(obj1.sayi2);


        System.out.println(obj1.sayi1);


        StaticKeywords obj2=new StaticKeywords();
        System.out.println(obj2.sayi2);
        System.out.println(obj2.sayi1);

        obj2.sayi1++;
        obj2.sayi2++;

        System.out.println(obj2.sayi2);
        System.out.println(obj2.sayi1);



    }

}
