package kendiCalismam3;



public class C17 {
    public static void main(String[] args) {


        String sifre="Acbsbja";
        if(((sifre.charAt(0)>='A'&&sifre.charAt(0)<='Z'))&&((sifre.charAt(sifre.length()-1)>='a'&&sifre.charAt(sifre.length()-1)<='z'))&&(!sifre.contains(" "))&&(sifre.length()>=8)){
            System.out.println("Sifre basari ile tanimlandi");
        }else{
            System.out.println("Islem basarisiz yeniden deneyin");
        }
    }
}
