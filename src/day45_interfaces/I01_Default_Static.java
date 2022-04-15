package day45_interfaces;

public interface I01_Default_Static {
    /*
    Interface lerde sadece abstract methodlar bulunur
    body si olan cocrete bir method olusturmak istedigimizde CTE verir
    ancak java 8 ve uzeri versiyonlarda istisnai olarak static veya default
    olarak tanimlanan method larin body si olabilir.
    ancak burada kullanilan default keyword u acces modifier degildir
    cunku interface lerde tum method lar public abstract ti.
    asagidaki ornekte gorulecegi gibi default olarak tanimlanmis bir method a acces  modifier
    olarak public yazabilirsiniz
    acces modifier yazmasak ta java method u public olarak kabul edecektir..

     */
    void method1();
    public  default void method2(){
        System.out.println("Interface deki default method");
    }
    static void method3(){
        System.out.println("Interface deki static method");
    }



}
