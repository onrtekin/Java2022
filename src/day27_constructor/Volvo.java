package day27_constructor;

public class Volvo {
    String marka="Volvo";
    String mensei="Isvec";
    String model;
    boolean elektrikliMi;
    int yil;
    String yakit;

    boolean otomatikPilot=otomatikPilotSorgus();
    int maxHiz=maxHizAta();

    public Volvo(String mdl, boolean elk, int yl, String ykt) {
        model=mdl;
        elektrikliMi=elk;
        yil=yl;
        yakit=ykt;
        maxHiz=maxHizAta();
        otomatikPilot=otomatikPilotSorgus();
    }
    public Volvo(){

    }


    public int maxHizAta() {
        int maxHiz=0;
        if(elektrikliMi){
            maxHiz=200;
        }else{
            maxHiz=220;
        }


        return maxHiz;
    }

    public boolean otomatikPilotSorgus() {

        boolean sonuc=false;
        if(elektrikliMi){
            sonuc=true;

        }return sonuc;

    }

    public  String toString(){

        String arabaOzellikleri="Model : "+model+
                " Yakit : "+yakit+" Max Hiz : "+maxHiz;





        return arabaOzellikleri;

    }
}
