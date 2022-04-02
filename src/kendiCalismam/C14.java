package kendiCalismam;

public class C14 {
    public static void main(String[] args) {
        String str1="Java bir baska guzel valla cok guzel";
        System.out.println(str1.indexOf('l'));
        System.out.println(str1.length()-1);

        System.out.println(str1.indexOf('b',6));
        int ilkIndex=str1.indexOf('a');
        System.out.println(str1.indexOf('a',ilkIndex+1));
        int ilkB=str1.indexOf('b');
        System.out.println(str1.indexOf('b',ilkB+1));

    }
}
