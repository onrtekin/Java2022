package day43_garbage_abstrackClass;

public  class C01_Final {
    final  static double piSayisi=3.14;
    final static String okulIsmi="Yildiz Koleji";

    public static void main(String[] args) {
        final int sayi=10;
         //okulIsmi="Java Koleji"; final degistirilemez


    }
    public static final void method1(){
        System.out.println("Parent class method1");
    }



}
