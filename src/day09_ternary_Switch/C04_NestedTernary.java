package day09_ternary_Switch;

public class C04_NestedTernary {
    public static void main(String[] args) {
        int sayi=121;

        if (sayi>=0){
            if (sayi%2==0){
                System.out.println("citf sayi");
            }else {
                System.out.println("tek sayi");
            }


        }else {
            if (sayi<-100){
                System.out.println("-100 den kucuk negatif");
            }else System.out.println("-100 den buyuk negatif sayi");
            }

        String sonuc=sayi>=0 ?
                     (sayi%2==0?"pozitif cift sayi": "pozitif tek sayi"):
                      (sayi<-100?"-100'den kucuk negatif sayi" : "-100'den buyuk negatif sayi");
        }

    }

