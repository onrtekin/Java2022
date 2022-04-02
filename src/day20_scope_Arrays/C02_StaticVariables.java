package day20_scope_Arrays;

public class C02_StaticVariables {
 static   String okulIsmi="Yildiz Koleji";
    static int okulNo;
    static boolean okulAcikMİ;


    public static void main(String[] args) {
        System.out.println(okulIsmi);
        System.out.println(okulNo);
        okulNo=102;
        System.out.println(okulNo);
        System.out.println(okulAcikMİ);
        System.out.println(okulNo);
        staticMethod();




    }
    public static void staticMethod(){
        okulNo=220;
        System.out.println(okulNo);


    }
}
