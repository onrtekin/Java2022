package day36_inheritance;

public class UstaBasi extends Isci{
    @Override
    public String toString() {
        return "UstaBasi{" +
                "isciStatu='" + isciStatu + '\'' +
                ", saatUcreti=" + saatUcreti +
                ", statu='" + statu + '\'' +
                ", maas=" + maas +
                ", personelNo=" + personelNo +
                ", isim='" + isim + '\'' +
                ", soyIsim='" + soyIsim + '\'' +
                ", adres='" + adres + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }

    public static void main(String[] args) {

        UstaBasi ustaBasi1=new UstaBasi();
        ustaBasi1.saatUcreti=15;
        ustaBasi1.isim="Murat";
        ustaBasi1.soyIsim="Gokcek";
        ustaBasi1.maas=ustaBasi1.maasHesapla();
        ustaBasi1.statu="Isci";
        ustaBasi1.isciStatu="Usta Basi";
        System.out.println(ustaBasi1);

    }

}
