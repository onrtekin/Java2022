package day13_stringManipulation;

public class C02_substring {
    public static void main(String[] args) {
        //arama sonucundaki bulunan sonuc sayisi 100 den cok ise super
        //az ise az sonuc  bulundu
        String str="1-48 of 10 results for \"nutella\"";
        int ilkSpace=str.indexOf(" ");
        int ikinciSpace=str.indexOf(" ",ilkSpace+1);
        int ucuncuSpace=str.indexOf(" ",ikinciSpace+1);
        String aramaSonusSayisiStr=str.substring(ikinciSpace+1,ucuncuSpace);

        System.out.println(aramaSonusSayisiStr);
        int sonuc=Integer.valueOf(aramaSonusSayisiStr);
        if(sonuc>100){
            System.out.println("super");
        }else{
            System.out.println("yeterli sonuc bulunmadi");
        }



    }
}
