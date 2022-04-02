package day30_passbyValue;

public class C02_StaticBlocks {
    {
        System.out.println("static olmayan blcok calisti");

    }
    static {

        System.out.println("static  block calisti");


    }

    public static void main(String[] args) {
        System.out.println("mainmethod basi");
    C02_StaticBlocks obj1=new C02_StaticBlocks();
    C02_StaticBlocks obj2=new C02_StaticBlocks();



    }
}
