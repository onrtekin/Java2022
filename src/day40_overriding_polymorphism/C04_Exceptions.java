package day40_overriding_polymorphism;

public class C04_Exceptions {
    //String olarak verilen bir sayiyi, integer a cevirip 2 katini yazdiralim
    public static void main(String[] args) {
        String str="12345a";

        //str icinde sayi olmayan bir karakter olursa hata verir.

        try {
            int sayi=Integer.parseInt(str);
            System.out.println(2*sayi);
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("girdiginiz sayi olmayan elementler iceriyor");
        }


    }
}
