package day18_nestedForLoop;

public class C10 {

    public static void main(String[] args) {

        int input=4;

        for (int i = 1; i <=input ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");

            }
            System.out.println("");
        }


    }
}
