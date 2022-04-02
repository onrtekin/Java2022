package day27_constructor;

public class ToyotaRunner {
    public static void main(String[] args) {

        Toyota t1=new Toyota();
        System.out.println(t1.marka);
        System.out.println(t1.tekerAdedi);
        System.out.println(t1.model);

        t1.model="Corolla";
        t1.yakit="Benzin";
        t1.yil=2022;
        System.out.println("T1 model: "+t1.model+", yakit : "+t1.yakit+", yili : "+t1.yil);
         t1.maxHiz();
         t1.renkTercihleri();

        Toyota t2=new Toyota();
        t2.model="Yaris";
        t2.yakit="Dizel";
        t2.yil=2021;
        t2.maxHiz();
        System.out.println("T2 model: "+t2.model+", yakit : "+t2.yakit+", yili : "+t2.yil);

            t2.renkTercihleri();





    }
}
