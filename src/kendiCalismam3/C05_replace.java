package kendiCalismam3;

public class C05_replace {
    public static void main(String[] args) {

        String str="Java ogrenmek123 Cok guzel@ ";
        str=str.replace("@",".");
        str=str.replaceAll("\\d","");
        System.out.println(str);


    }
}
