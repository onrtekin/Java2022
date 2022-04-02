package day36_inheritance;

public class Memur extends Muhasebe {


    public static void main(String[] args) {
        Memur memur1 = new Memur();
        //bu classin uyesi olmasina ragmen inherit ettigi Muhasebe ve onunda
        //Parenti olan personel class larindaki tum datalari alabilir
        //Personel Classindan
        memur1.personelNo = 1001;
        memur1.isim = "Ahmet";
        memur1.soyIsim = "Tepecik";
        memur1.adres = "Ankara";
        memur1.tel = "3124556546";
        //Mhasebe Clasindan
        memur1.saatUcreti = 10;
        memur1.maas = memur1.maasHesapla();
        memur1.statu = "Memur";
        System.out.println(memur1);
        Memur memur2=new Memur();
        memur2.personelNo=1002;

        memur2.maas = memur2.maasHesapla();
        System.out.println(memur2);
    }
    @Override
    public String toString() {
        return "Memur{" +
                "saatUcreti=" + saatUcreti +
                ", statu='" + statu + '\'' +
                ", maas=" + maas +
                ", personelNo=" + personelNo +
                ", isim='" + isim + '\'' +
                ", soyIsim='" + soyIsim + '\'' +
                ", adres='" + adres + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }

}


