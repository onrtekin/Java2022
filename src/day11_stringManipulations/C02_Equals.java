package day11_stringManipulations;

public class C02_Equals {
    public static void main(String[] args) {

        String str1="Ali Can";
        System.out.println("str1 = " + str1);
        String str2="Ali"+" Can";
        System.out.println("str2 = " + str2);

        String str5="hasan";
        String str6="HASAN";
        System.out.println(str5.equals(str6));
        System.out.println(str5.toUpperCase().equals(str6));
    }
}
