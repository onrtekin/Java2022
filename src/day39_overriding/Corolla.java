package day39_overriding;

public class Corolla extends Toyota{
    protected String hiz="Corolla max 200 km hiz yapar";
    protected String yakit="Corolla benzinli veya elektriklidir";
    protected String model="Corolla";


    public  void motor(){
        System.out.println("Corolla araclar cevreci motor kullanirlar");
    }
    public void yakitTuketimi(){
        System.out.println("Corolla 5,6 lt yakit tuketirler");
    }
    public void vitesSayisi(){
        System.out.println("Corolla 5 viteslidir");
    }

    public static void main(String[] args) {
        /*
        Data turu ve cons. farkli oldugunda cons. calistigi icin obje cons. oldugu
        class ozelliklerini tasir ancak Data turu Parent class secildigi icin
        variable ler data turunun secildigi class ve onun parent class larindan deger alabilir

        Methodlar icin ise yine data turunun oldugu class a gideriz ancak direk methodu calistirmadan once
        method override edilmismi diye kontrol ederiz

         */
        Corolla araba1=new Corolla();
        System.out.println(araba1.hareket);//Arabalar teker ile hareket eder
        System.out.println(araba1.hiz);//Corolla max 200 km hiz yapar
        System.out.println(araba1.yakit);//Corolla benzinli veya elektriklidir
        System.out.println(araba1.marka);//Toyota
        System.out.println(araba1.sirketMerkezi);//Japonya
        System.out.println(araba1.model);//Corolla
        araba1.motor();//Corolla classi


        Toyota araba2=new Corolla();
        System.out.println(araba2.hareket);//Arabalar teker ile hareket eder
        System.out.println(araba2.hiz);//Toyota araclar max 220 km hiz yaparlar
        System.out.println(araba2.yakit);//Arabalar farkli yakitlar kullanabilir
        System.out.println(araba2.marka);//Toyota
        System.out.println(araba2.sirketMerkezi);//Japonya
        //System.out.println(araba2.model);//CTE
        araba2.motor();
        araba2.garanti();
        araba2.yakitTuketimi();
        //araba2.vitesSayisi();Data turu olan toyota dan baslayinca boyle bir method bulamadik
        //dolayisiyla CTE




        Araba araba3=new Corolla();
        System.out.println(araba3.hareket);//Arabalar teker ile hareket eder
        System.out.println(araba3.hiz);//Arabalar motor gucune gore hiz yaparlar
        System.out.println(araba3.yakit);//Arabalar farkli yakitlar kullanabilir
        System.out.println(araba3.marka);//Arabalar uretildikleri markaya sahiptir
        //System.out.println(araba3.sirketMerkezi);//CTE
        //System.out.println(araba3.model);//CTe
        araba3.yakitTuketimi();//Corolla class indaki method calisir
        araba3.motor();//Corolla class taki method calisir
        //araba3.garanti();Cte
        //araba3.vitesSayisi();CTE



    }
}
