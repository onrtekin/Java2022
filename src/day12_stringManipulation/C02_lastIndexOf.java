package day12_stringManipulation;

public class C02_lastIndexOf {
    public static void main(String[] args) {
        String cumle="Java ogren, yeni program ile yeni bir sayfa ac";
        String kelime="yeni";


        int ilkKullanim=cumle.indexOf(kelime);
        int sonKullanim=cumle.lastIndexOf(kelime);
        if(ilkKullanim==-1){
            System.out.println("Kullanilmamistir");
        }else if(ilkKullanim==sonKullanim){
            System.out.println("bir kere kullanilmistir");
        }else{
            System.out.println("birden cok kullanilmistir");
        }

        String str="Eplipse";
        System.out.println(str.lastIndexOf("p",3));

    }
}
