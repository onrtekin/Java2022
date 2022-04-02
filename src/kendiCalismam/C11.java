package kendiCalismam;

import java.util.Scanner;

public class C11 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Derse Katicakmisiniz");
        String cevap=scan.next();

        if(cevap.equalsIgnoreCase("evet")){
            System.out.println("cevabiniz : "+cevap+" derse katiliminiz alinmistir");
        }else if(cevap.equalsIgnoreCase("hayir")){
            System.out.println("cevabiniz = " + cevap+" sonraki derslerimize bekleriz");
        }else{
            System.out.println("lutfen \"evet\" veya \"hayir\" yaziniz");
        }




    }



}
