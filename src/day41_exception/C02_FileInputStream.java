package day41_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C02_FileInputStream {
    public static void main(String[] args){
        /*
        Bir kod yazilirken olasi exception lar ongorulup exception olustugunda
         javanin ne yapmasini istedigimiz belirtilmelidir.
        1-Eger kodun calismasini istemiyorsak method isminin yanina olusabilecek exceptionu
        deklare edebiliriz
        2-kodun calismaya devam etmesini istiyorsak sorun olusturabilecek kodu try catch blogunun icine alir
        try bloguna sorun cikabilecek kodu catch bloguna olusabilecek exceptionu ve javanin
        ne yapmasini istedigimiz yazabiliriz...

        */
        String dosyaYolu="src/day41_exception/dosya";
        try {
            FileInputStream fis=new FileInputStream(dosyaYolu);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
