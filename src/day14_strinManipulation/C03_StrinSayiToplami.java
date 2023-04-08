package day14_strinManipulation;

public class C03_StrinSayiToplami {
    public static void main(String[] args) {

        String str1="$13.99";
        String str2="$10.55";

        str1=str1.substring(1);
        str2=str2.substring(1);
        System.out.println(Double.valueOf(str1)+Double.valueOf(str2));



    }
}
