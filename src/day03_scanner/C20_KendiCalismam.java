package day03_scanner;

public class C20_KendiCalismam {


    public static void main(String[] args) {

        int sayi1=10;
        int sayi2=20;

        System.out.println("Swap'dan önce sayi1 : "+ sayi1+ ", Swap'dan önce sayi2 : "+ sayi2);

        int temp=sayi1;
        sayi1=sayi2;
        sayi2=temp;

        System.out.println("Swap'dan sonra sayi1 : "+ sayi1+ ", Swap'dan sonra sayi2 : "+ sayi2);

    }
}
