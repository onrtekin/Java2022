package day03_scanner;

import java.util.Scanner;

public class C10_Scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in); // esitligin saginda yeni bir scanner olusturulur
                                             // ve olusturulan scanner scan variable'na assin edilir
                                             // scan variable'in ismidir istegimiz ismi verebiliriz
        // 2. adim kullanicidan istedigimiz degeri girmesi icin aciklayici bir bilgi yaziniz

        System.out.println("Lutfen isminizi giriniz");
        // 3. adim kullanicinin girdigi degeri uygun bir variable olusturup kaydedin

        String isim=scan.nextLine();
        System.out.println("Kullanicinin girdigi isim : "+ isim);





    }



}
