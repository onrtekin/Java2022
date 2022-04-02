package kendiCalismam3;

import java.util.Scanner;

public class C16 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 4 harfli bir kelime giriniz");
        String kelime=scan.next();


        System.out.println(kelime.substring(3)+kelime.substring(2,3)+kelime.substring(1,2)+kelime.substring(0,1));
    }
}
