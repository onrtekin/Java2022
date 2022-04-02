package day15_methoCreation;

public class C08_MethodCreation {
    public static void main(String[] args) {

        String isim="oguzhan";
        String soyIsim="BALKAYA";
        String kKNo="1234567890123456";


        String gizlenmisIsimSoyisim=isimSoyIsimGizle(isim,soyIsim);
        System.out.println(gizlenmisIsimSoyisim);
        String gizlemisKKNo=kredikartiGizle(kKNo);

        System.out.println(gizlemisKKNo);










    }

    private static String kredikartiGizle(String kKNo) {
        String yeniKKNo="**** **** **** "+kKNo.substring(12);
        return yeniKKNo;
    }

    public static String isimSoyIsimGizle(String isim, String soyIsim) {
        String yeniIsim=isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\S","*");
        String yeniSoyIsim=soyIsim.substring(0,1).toUpperCase()+soyIsim.substring(1).replaceAll("\\S","*");

        return yeniIsim+" "+yeniSoyIsim;

    }


}
