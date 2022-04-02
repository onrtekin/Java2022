package day22_arays;

import java.util.Arrays;

public class C06_BinarySearch {
    public static void main(String[] args) {
        int arr[]={3,5,6,7,1,9,45,25,4,9,0};
        int istenenSayi=-8;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr,istenenSayi));

    }
}
