package day15_methoCreation;

import java.util.Scanner;

public class C02_MethodCreation {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir kelime yaziniz");
        String kelime=scan.next();

        String tersKelime="";


        if(kelime.length()<3){
            System.out.println("Kelime cok kisa");




        }else if(kelime.length()<=5){
            if(kelime.length()==3){
                tersKelime=kelime.substring(2)+
                        kelime.substring(1,2)+
                        kelime.substring(0,1);

            }else if(kelime.length()==4){
                tersKelime=kelime.substring(3)+kelime.substring(2,3)+
                        kelime.substring(1,2)+
                        kelime.substring(0,1);

            }else{
                tersKelime=kelime.substring(4)+kelime.substring(3,4)+kelime.substring(2,3)+
                        kelime.substring(1,2)+
                        kelime.substring(0,1);

            }
            System.out.println("kelimedeki harf sayisi : "+kelime.length());
            System.out.println("Kelimenin tersten yazilisi : "+tersKelime);



        }else{
            System.out.println("Kelime cok uzun");

        }



    }
}
