package day15_methoCreation;

public class C07_MethodCreation {
    public static void main(String[] args) {

      hosgeldinYazdir();






    }

    private static void kapanmaMethodu() {
        System.out.println("Bizi tercih ettiginiz icin tesekkur ederiz");
    }

    public static void hosgeldinYazdir() {
        System.out.println("Hosgeldin");
        stringYazdir("Boylede olur");

    }

    private static void stringYazdir(String str) {
        System.out.println(str);
        kapanmaMethodu();

    }
}
