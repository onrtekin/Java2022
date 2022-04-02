package day34_accesModifier_encapsulation;

public class C04_Encapsulation {
    public static void main(String[] args) {
/*
        bir variable i encapsule etmel icin
        1-Acces Modifier i private yapariz
        2-okuma ve yazma ozelliklerini istedigimiz gibi sinirlayabiliriz
        -sadece okuma getter
        --sedece deger girilmesi setter
        methodlarini olustururuz
        Bir variable icin hem getter hem setter olusturursaniz o varible public olmus gibi hem okuyup
        hem yazilmasini saglayabilirsiniz.

        Piyasada dev. arasinda genel uygulamada boyledir.


*/
        C03 obj=new C03();
        System.out.println(obj.getSayi());
        obj.setStr("Java Java Java");
        System.out.println(obj.getStr());
        System.out.println(obj);


    }
}
