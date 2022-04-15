package day45_interfaces;

public class C02_Default_Static_Method implements I01_Default_Static{
    /*
    Bir interface de default veya static olarak tanimlanan ve body si olan methodlarin override
    edilmesi mecburi degildir.

    Eger static olarark tanimlanmissa zaten override edemeyiz

     */
    @Override
    public void method1() {
        System.out.println("child class method1");

    }

    public static void main(String[] args) {
        //interface de static olarak tanimlanan method lara static yontemlerle ulasilabilir

        I01_Default_Static.method3();
        C02_Default_Static_Method obj = new C02_Default_Static_Method();
        obj.method1();//Child Class
        obj.method2();//Parent Interface
       // obj.method3();eski classlarda static bir uyeye static olmayan yollarlada ulasabilirdik
        //ancak interface icerisinda static olarak tanimlanan methoda static olmayan yontemlerle
        //ulasilamaz...



    }
}
