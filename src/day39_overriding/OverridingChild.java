package day39_overriding;

public class OverridingChild extends OverridingParent {

    public void method1(){
        System.out.println("Child class method1");
    }

    public static void main(String[] args) {
        /*
        Bir obje olusturulurken data turu ve cons. ayni class tan secilmisse java direk o class a gider
        hem variable hem method icin o class ta varsa kullanir yoksa o class in parent larina bakar
         */
        OverridingChild obj1=new OverridingChild();
        obj1.method1();//Child class method1
        obj1.method2();//Parent class method2

        /*
        Data turu parent cons. child class tan secilmisse variable larda yukaridaki sekilde calisma devam eder
        method lar icin data turunun oldugu class daki method  child class tarafindan
        Override edilmismi diye kontrol edilmelidir
        eger child class larda bu method Override edilmisse override eden method calisir.
         */
        OverridingParent obj2=new OverridingParent();
        obj2.method1();
        OverridingParent obj3=new OverridingParent();
        obj3.method1();
        obj3.method2();
    }
}
