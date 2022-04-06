package day37_inheritance;

import day36_inheritance.Parent;

public class Child extends Parent {
    //bir classi child class yaptigimizda parent class taki constructor a ulasmasi gerekir
    //bu durumda parent class taki constructor in acces modifier i uygun olmalidir.
// child class ta tum constructor larin ilk satirina javanin yerlestirdigi constructor
    //parametresizdir yani---> super();

    Child(){
        super();
        System.out.println("child class parametresiz constructor");
    }
    Child(int s){
        System.out.println("Child class parametreli constructor");
    }
    Child(int sayi1,int sayi2){
        //eger parent classten paremetresiz cons. degilde baska bir cons. calistirmak
        //isterseniz bunu child class taki cons. ilk satirina yazmalisiniz.
        super(sayi1, sayi2);
        System.out.println("iki parametreli constructor");
    }

    public static void main(String[] args) {
        Child child=new Child(5,8);
    }
}
