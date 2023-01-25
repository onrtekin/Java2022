package day14_strinManipulation;

public class C03_StrinSayiToplami {
    public static void main(String[] args) {


        String str="11.11.2011";
        String yeniStr=str.substring(0,1)+str.substring(1,2).replaceAll("\\S","*")+str.substring(2,4)+str.substring(4,5).replaceAll("\\S","*")+str.substring(5);

        System.out.println(yeniStr);

    }
}
