package day34_accesModifier_encapsulation;

public class C02_AccesModifier {
    public static void main(String[] args) {
        C01 obj=new C01();
        obj.acikStr="Bye";
        C01.acikSayi=50;
        // private accemodifier oldugundan baska class tan erisilemez
       // obj.method1
        //C01 objParametreli=new C01(5); private accemodifier oldugundan baska class tan erisilemez


    }
}
