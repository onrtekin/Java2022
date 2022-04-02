package day12_stringManipulation;

public class C04_endsWith {
    public static void main(String[] args) {

        String mail="mulkiyeayboy@gmail.com";
        String arananMetin="@gmail.com";

        if(!mail.contains(arananMetin)){
            System.out.println("gmail adresi giriniz");
        }else if(mail.endsWith(arananMetin)){
            System.out.println("mail adresiniz kaydedildi");
        }else{
            System.out.println("kontrol edin");
        }



    }
}
