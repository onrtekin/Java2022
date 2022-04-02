package day14_strinManipulation;

import java.util.Scanner;

public class C02_TertenYazdirma {
    public static void main(String[] args) {

        String input="ASLİ";

        String tersStr=input.toUpperCase().substring(3)+input.substring(2,3).toLowerCase()+
                input.substring(1,2).toLowerCase()+input.substring(0,1).toLowerCase();
        System.out.println(tersStr);
    }
}
