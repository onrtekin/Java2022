package day23_multiDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class C07_Arrays {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir cumle giriniz");
        String cumle=scan.nextLine();
        String arr[]=cumle.split(" ");
        System.out.println(Arrays.toString(arr));

        System.out.println("girdiginiz cumledeki kelime sayisi "+arr.length);
    }
}
