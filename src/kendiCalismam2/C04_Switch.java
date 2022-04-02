package kendiCalismam2;

import java.util.Scanner;

public class C04_Switch {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen \'SDET\' Kısaltmasindaki Harlerden Birini Yaziniz");
        char harf=scan.next().toUpperCase().charAt(0);

        switch(harf) {
            case 'S':
                System.out.println("\"Software\"");
                break;
            case 'D':
                System.out.println("\"Developer\"");
                break;
            case 'E':
                System.out.println("\"Engineer\"");
                break;
            case 'T':
                System.out.println("\"In Testing\"");
                break;
                default:
                    System.out.println("\'Gecerli Bir Harf Giriniz");






        }


    }
}
