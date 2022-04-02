package day22_arays;

import java.util.Arrays;

public class C05_BinarySearch {
    public static void main(String[] args) {

        //verilen arrayde istenen bir elementin var olup olmadigini true false yazdirarak gosteren bir method olusturun

        int arr[]={3,5,6,7,1,9,45,25,4,9,0};
        int istenenSayi=14;
        istenenElemanVarmi(arr,istenenSayi);
        // javada hazir BinarySearch ile yapmak istersekonce sort kullanip sonra Binarysearch yapilmali.





    }

    private static void istenenElemanVarmi(int[] arr, int istenenSayi) {
boolean sonuc=false;
        for (int i = 0; i < arr.length; i++) {

            if(arr[i]==istenenSayi){
                sonuc=true;

                break;
            }

        }

        System.out.println(sonuc);
    }
}
