package day40_overriding_polymorphism;

public class C02 extends C01{


    private  void method4(){
        System.out.println("Child method4");
    // parent class daki private method4 e Child class dan ulasmamiz mumkun olmadigindan
    //    java bu iki method u tamamen farkl, 2 method olarak kabul eder

    }

    @Override
    protected String method3(){
//Covariant icin yazikdi
        return "Java";
    }


    @Override
    public void method2() {
        /*
        @Override notasyonu overridden method ile overriding methodu
        birbirine baglar.
        notasyon silinirse veya signature degistirilirse CTE verir.
        Notasyon kullanilmazsa java bunlarin iliskisini bilir
        ama overridden method silinirse sesini cikarmaz

         */
        System.out.println("Child method2");
    }

    public static void main(String[] args) {
        C02 obj = new C02();
        obj.method1();//parent method1
        obj.method2();//child method
        C01 obj2=new C02();
        obj2.method1();//parent method1
        obj2.method2();//Child method2
        C01 obj3=new C01();
        obj3.method1();//parent method1
        obj3.method2();//parent method1

    }
}
