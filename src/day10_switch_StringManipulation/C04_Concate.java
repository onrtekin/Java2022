package day10_switch_StringManipulation;

public class C04_Concate {
    public static void main(String[] args) {

        String str1="Java";
        String str2="Candir";
        System.out.println(str1+" "+str2);

        String cumle=str1.concat(str2);
        cumle=str1.concat(" ").concat(str2);
        System.out.println("cumle = " + cumle);


    }
}
