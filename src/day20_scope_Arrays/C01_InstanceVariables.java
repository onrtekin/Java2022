package day20_scope_Arrays;

public class C01_InstanceVariables {

    int sayi;
    String bransIsmi="Java";
    boolean okulAcikMi;


    public static void main(String[] args) {

    //    sayi=10; sayi variable static olmadigi icin direk kullanilamaz, obje olusturmamiz gerekir.

        C01_InstanceVariables obj1=new C01_InstanceVariables();
        System.out.println(obj1.sayi);// 0
        obj1.sayi=10;
        System.out.println(obj1.sayi);//10
        obj1.bransIsmi="SQL";
        System.out.println(obj1.okulAcikMi);

        C01_InstanceVariables obj2=new C01_InstanceVariables();
        System.out.println(obj2.sayi);//0
        System.out.println(obj2.bransIsmi);
        obj1.okulAcikMi=true;
        System.out.println(obj2.okulAcikMi);


    }
}
