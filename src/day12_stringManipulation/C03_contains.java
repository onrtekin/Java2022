package day12_stringManipulation;

public class C03_contains {
    public static void main(String[] args) {
        String mail="mulkiyeayboy@gmail.com.tr";
        String arananMetin="@gmail.com";
        if(!mail.contains(arananMetin)){
            System.out.println("gmail adresi giriniz");
        }else if(mail.lastIndexOf(arananMetin)==(mail.length()-10)){
            System.out.println("email adresiniz kaydedidi");
        }else{
            System.out.println("Kontrol edin");
        }
    }
}
