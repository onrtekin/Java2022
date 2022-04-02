package day18_nestedForLoop;

public class C05_NestedForLoop {
    public static void main(String[] args) {

        char input='Z';
        for (char i = 'A'; i <=input ; i++) {
            for (char j = 'A'; j <=i ; j++) {
                System.out.print(j+" ");

            }
            System.out.println("");

        }
    }
}
