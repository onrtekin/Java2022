package kendiCalismam3;

public class C06 {
    public static void main(String[] args) {

        String str1="$13.99";
        String str2="$10.55";
        str1=str1.replace("$","");
        str2=str2.replace("$","");


        System.out.println(Double.parseDouble(str1)+Double.parseDouble(str2));


    }
}
