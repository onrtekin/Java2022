package day10_switch_StringManipulation;

public class C05_charAt {
    public static void main(String[] args) {


        String str="java Cok Guzel";
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(9));
        System.out.println(str.charAt(2)+""+str.charAt(3));
        System.out.println(str.toLowerCase().charAt(5)+""+str.toUpperCase().charAt(6)+str.toUpperCase().charAt(7));
        System.out.println(str.charAt(str.length()-1));



    }
}
