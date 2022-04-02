package day16_methodCreation;

public class C01_MethdIleSifreKontrol {
    public static void main(String[] args) {


        String sifre="Af1235aa";

        boolean ilkHarf=ilkHarfKontrolEt(sifre);
        boolean sonHarfKontrol=sonHarfKontrolEt(sifre);
        boolean boslukKontrol=boslukKontrolEt(sifre);
        boolean uzunlukKontrol=uzunlukKontrolEt(sifre);


     if(ilkHarf && sonHarfKontrol&&boslukKontrol&&uzunlukKontrol){
         System.out.println("sifre basarili");
     }else{
         System.out.println("islem basarisiz ");
     }


    }

    private static boolean uzunlukKontrolEt(String sifre) {
        boolean uzunlukKontrolSonuc=false;
        if(sifre.length()>=8){
            uzunlukKontrolSonuc=true;
        }else{
            System.out.println("uzunluk 8 karakterden kucuk olmamali");
        }return uzunlukKontrolSonuc;
    }

    private static boolean boslukKontrolEt(String sifre) {
        boolean boslukKontrolSonuc=false;
        if(!sifre.contains(" ")){
            boslukKontrolSonuc=true;
        }else{
            System.out.println("sifre bosluk icermemeli");

        }    return boslukKontrolSonuc;
    }

    private static boolean sonHarfKontrolEt(String sifre) {
        boolean sonHarfSonuc=false;
        char sonHarf=sifre.charAt(sifre.length()-1);
        if(sonHarf>='a'&& sonHarf<='z'){
            sonHarfSonuc=true;

        }else{
            System.out.println("son harf kucuk olmali");
        }


        return sonHarfSonuc;
    }

    private static boolean ilkHarfKontrolEt(String sifre) {

        char ilkHarf=sifre.charAt(0);
        boolean ilkHarfSonuc=false;
        if(ilkHarf>='A'&&ilkHarf<='Z'){
            ilkHarfSonuc=true;

        }else {
            System.out.println("ilk harf buyuk olmali");
            //ilkHarfSonuc=false; yukarida oldugu icin gerek yok

        }


        return ilkHarfSonuc;
    }
}
