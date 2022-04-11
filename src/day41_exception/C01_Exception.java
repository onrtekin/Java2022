package day41_exception;

public class C01_Exception {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        int c=0;

        try {
            c=a/b;
        } catch (Exception e) {
            //e.printStackTrace();
           // burada yazdigimiz e javanin exception 'i atayacagi obje

            System.out.println(e.getMessage());

        }
        System.out.println(c);
    }
}
