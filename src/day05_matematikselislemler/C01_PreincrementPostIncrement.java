package day05_matematikselislemler;

public class C01_PreincrementPostIncrement {
    public static void main(String[] args) {
        int sayi=10;

        // 1 artirmak istersek
        sayi ++;
        System.out.println(sayi);
        sayi++;
        System.out.println(sayi);


        System.out.println(++sayi);

        System.out.println(sayi);//  pre increment


        System.out.println(sayi++);
        System.out.println(sayi);

    }
}
