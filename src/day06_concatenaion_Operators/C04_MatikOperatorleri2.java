package day06_concatenaion_Operators;

public class C04_MatikOperatorleri2 {
    public static void main(String[] args) {
        System.out.println(5+2==8);
        boolean sonuc1=5>4 && 7<9 && 6+3==9 && 5+2!=8;
        System.out.println(sonuc1);

        boolean sonuc2=5>4 && 7>9 && 6+3==9 && 5+2!=8;
        System.out.println(sonuc2);
        boolean sonuc3=5>4 & 7>9 & 6+3==9 & 5+2!=8;
        System.out.println(sonuc3);

        int sayi=15;
        System.out.println(sayi>10 && sayi<20);
        int sayi2=5;
        System.out.println(sayi2<10  ||   sayi2>20);



    }
}
