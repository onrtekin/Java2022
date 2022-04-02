package day14_strinManipulation;

public class C04_IsimGizleme {
    public static void main(String[] args) {

        String isim="oguzhan";
        String soyIsim="BALKAYA";
        String kKNo="1234567890123456";
        String yeniIsim=isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\S","*");
        String yeniSoyIsim=soyIsim.substring(0,1).toUpperCase()+soyIsim.substring(1).replaceAll("\\S","*");
        String yeniKKNo="**** **** **** "+kKNo.substring(12);
        System.out.println("isim-soyisim : "+yeniIsim+" "+yeniSoyIsim);
        System.out.println("kart no : "+yeniKKNo);


    }
}
