package day30_passbyValue;

public class C01_StaticBlocks {
    static {
        System.out.println("static block calisti");
    }
    static {
        System.out.println("static 2.block calisti");
    }

    C01_StaticBlocks() {

        System.out.println("constructor calisti ");
    }

    public static void main(String[] args) {
        System.out.println("main method baslangici");
        C01_StaticBlocks obj1;
        new C01_StaticBlocks();


    }

}
