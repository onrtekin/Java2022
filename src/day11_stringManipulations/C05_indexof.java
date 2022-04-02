package day11_stringManipulations;

import java.util.Scanner;

public class C05_indexof {
    public static void main(String[] args) {
        String str1="Java bir baska guzel valla cok guzel";
        System.out.println(str1.indexOf('J'));

        System.out.println(str1.indexOf("l"));
        System.out.println(str1.length()-1);
        System.out.println(str1.indexOf("aska"));
        System.out.println(str1.indexOf("b"));


        System.out.println(str1.indexOf('b',5));
        int ilkindex=str1.indexOf('a');
        System.out.println(str1.indexOf('a',ilkindex+1));

        System.out.println(str1.indexOf("guzel",20));

        System.out.println(str1.indexOf("y"));

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen Mailinizi Yaziniz");
        String mail=scan.next();

        if(mail.indexOf("@")==(-1)){
            System.out.println("Gecersiz");
        }else{
            System.out.println("mailiniz kabul edldi");
        }


    }
}
