package day28_consructor;

public class Rope {
    public static void swing() {
        System.out.print("swing ");
    }
    public  void climb() {
        System.out.print("climb");
    }
    public static void play() {

        swing();
       //climb();
        Rope obj1=new Rope();
        obj1.climb();
    }
    public static void main(String[] args) {

        Rope rope=new Rope();
        rope.play();
        Rope rope2=null;
        rope2.play();

    }

}
