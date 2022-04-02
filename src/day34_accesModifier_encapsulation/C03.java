package day34_accesModifier_encapsulation;

public class C03 {
    // encapsule edeceegimiz 2 variable olsun
    private  int sayi;
    private String str;

    public int getSayi() {
        return sayi;
    }

    @Override
    public String toString() {
        return
                "sayi=" + sayi +
                ", str=" + str ;

    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}
