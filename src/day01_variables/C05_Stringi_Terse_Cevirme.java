package day01_variables;


import java.util.Scanner;

public class C05_Stringi_Terse_Cevirme {
    public static void main(String[] args) {

        // Verilen sayinin asal sayi (prime Number olup olmadigini yazdiran bir method olusturma//
        // Yazdiran dedigi icin void degil int olacak method

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a string that you want to reverse");
        String str = scan.nextLine();
        String strReverse = "";
        for (int i = str.length(); i >= 1; i--) {                         //length() yaptigimiz icin i>1 olacak, length()-1 yapsaydik i>0 olacakti
            strReverse = strReverse+ str.substring(i - 1, i);             // length() karakter sayisina, length()-1 index sayisina bakiyor
            // Soruda kaydet dedigi icin yeni veriyi str'ye atiyoruz
        }
        str = strReverse;            // you have to make sure this one and print is out of loop brackets, otherwise
        System.out.println(str);     // gives error
    }
}