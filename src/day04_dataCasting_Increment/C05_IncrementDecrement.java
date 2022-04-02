package day04_dataCasting_Increment;

public class C05_IncrementDecrement {

    public static void main(String[] args) {
        int sayi=20;

        System.out.println(sayi+10); // bu satirda sayinin 10 fazlasini yazdirdim


        System.out.println(sayi);
        // eger atama yapmazsak sayida yaptigimiz artirma azaltma kaydedilmez

        sayi=sayi+10;
        System.out.println(sayi);

        System.out.println(sayi=sayi+=10);

        System.out.println(sayi);
        System.out.println(sayi=sayi=sayi+10);

        System.out.println(sayi+=10);

        System.out.println(sayi++);
        System.out.println(sayi);
        System.out.println(++sayi);
        System.out.println(sayi);
        // bir variable in degerini kalici olarak artirmak azaltmak isterseniz




    }
}
