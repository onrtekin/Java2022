package day01_variables;

import java.util.Scanner;

public class a {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        System.out.println("bir harf gir : ");

        char harf=scanner.next().toUpperCase().charAt(0);

        if(harf=='o') System.out.println("Ocak");

    }
}
