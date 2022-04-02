package day27_constructor;

public class Toyota {

    String model;
    String marka="Toyota";
    int tekerAdedi=4;
    boolean motoruVarmi=true;
    String yakit;
    int yil;

    public void maxHiz(){
        if(yakit.equals("Benzin")){
            System.out.println("Benzinli araclar max 240 km hiz yapabilir");
        }else if(yakit.equals("Dizel")){
            System.out.println("Dizel araclar max 260 km hiz yapabilir");
        }
    }

         public void renkTercihleri(){
        if(model.equals("Corolla")){
            System.out.println("Corolla renk secenekleri kirmizi ve beyaz");
        }else if(model.equals("Yaris")){
            System.out.println("Yaris renk secenekleri siyah ve beyaz");
        }
         }
}
