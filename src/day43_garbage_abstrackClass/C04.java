package day43_garbage_abstrackClass;

public abstract class C04 {
    /*
    bir abstract class da abs. ve conc. methodlar bulunabilir.
    Child class larin abst. methodlari override etmesi mecburi iken
    concrete methodlarin override  edilmesi opsiyoneldir.

     */
    public abstract void abstractMethod();
    public static void concreteMethod2(){
        System.out.println("C04 concrete method");
    }

    public static void main(String[] args) {
        /*
            Abstract class lar constructor a sahiptir ancak
        abstract lardan obje olusturulamaz

            Abstract class lar obje barindirmayan sadecechild
            class lar icin uyulmasi
            sart olan veya opsiyonel birakilan ozellikleri tanimladigimiz
            bir depo class gibidir..

         */
        //C04 obj = new C04();

    }
}
