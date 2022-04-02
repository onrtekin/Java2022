package day26_foreachLoop_Constructor;

public class Araba {
    // javada her class olusturdugumuzda java o class tan ileride objeler uretmesi gerekecegini bilir
    //  her olusturdugu classa bir constructor koyar
    // class olustutrurken classa koydugu constructor aDEFAULT CONSTRUCTOR denir ve gorunmez
    // gorunur bir comstructor olsun istersek default constructor ile ayni gorevi yapan bir constructor olusturabiliriz
    //ayni kaliptan farkli desenlerde objeler olusturmak icin farkli ozelliklerde constructorlar olusturabiliriz
    //birbirinden farklilistiran tek ayrilacalik kullanilan parametre sayisi ve parametre data turudur.
    // Constructor larin ismi class ismi ile ayni olmak zorundadir yani buyuk harfle baslar.
    //Constructor larin return type olmaz. varsa o method dur.
    // ozetle: Constructor in adi class ismiyle ayni olmali ve return type olmamali.




    public Araba(){
        System.out.println("parametresiz constructor calisti");



        }

public Araba(int yil){
            System.out.println(yil+" model araba uretildi");



    }
    public Araba(String renk){

        System.out.println(renk+" renkli araba uretildi");
    }


public Araba(int yil,String renk){
    System.out.println(yil+" model "+renk+" renk araba uretldi");
}


}
