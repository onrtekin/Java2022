package day36_inheritance;

public class Child extends Parent{
    Child() {
        super();
        System.out.println("Child constructor calisti");

    }
    // tum classlarda gormesekte javanin olusturdugu default constructor vardir.
    //Extends keyword kullanan constructor larin ilk satirinda biz gormesek bile super () constructor call vardir.
    //yani parent classin parametresiz constructor call

    public static void main(String[] args) {
        Child child=new Child();
    }


}
