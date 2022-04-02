package day12_stringManipulation;



public class C01_indexOf {
    public static void main(String[] args) {




        String cumle="Java ogren, yeni program ile yeni bir sayfa ac";
        String kelime="yeni";


        int ilkKullanim=cumle.indexOf(kelime);
        int ikinciKullanim=cumle.indexOf(kelime,ilkKullanim+1);
        if(ilkKullanim==(-1)){
            System.out.println("kullanilmamis");
        }else if(ikinciKullanim==(-1)){
            System.out.println("bir kere kullanilmis");
        }else{
            System.out.println("birden fazla kullanilmis");
        }


    }
}
