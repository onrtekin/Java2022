package day15_methoCreation;

public class C04 {
    public static void besHarfiTersineCevir(String kelime) {
        String tersKelime=kelime.substring(4)+kelime.substring(3,4)+kelime.substring(2,3)+
                kelime.substring(1,2)+
                kelime.substring(0,1);
        System.out.println("kelimedeki harf sayisi : "+"5");
        System.out.println("Kelimenin tersten yazilisi : "+tersKelime);


    }

    public static void dortHarfiTersineCevir(String kelime) {
        String tersKelime=kelime.substring(3)+kelime.substring(2,3)+
                kelime.substring(1,2)+
                kelime.substring(0,1);
        System.out.println("kelimedeki harf sayisi : "+"4");
        System.out.println("Kelimenin tersten yazilisi : "+tersKelime);
    }

    public static void ucHarfiTersineCevir(String kelime) {
        String tersKelime=kelime.substring(2)+
                kelime.substring(1,2)+
                kelime.substring(0,1);
        System.out.println("kelimedeki harf sayisi : "+"3");
        System.out.println("Kelimenin tersten yazilisi : "+tersKelime);
    }
}
