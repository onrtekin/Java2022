package day04_dataCasting_Increment;

public class C06_Swap {
    public static void main(String[] args) {
        // verilern iki sayiyi 3. bir variable kullanmadan degistirme

        int sayi1=10;
        int sayi2=20;
        System.out.println("Swap'dan önce sayi1 : "+ sayi1+ " "+ "Swap'dan önce sayi2 : "+ sayi2 );

        sayi1=sayi1+sayi2;
        sayi2=sayi1-sayi2;
        sayi1=sayi1-sayi2;

        System.out.println("Swap'dan sonra sayi1 : "+ sayi1+ " "+ "Swap'dan sonra sayi2 : "+ sayi2 );

    }
}
