package day41_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_FileInputStream {
    public static void main(String[] args) {
        /*
        Bir kod yazilirken olasi exception lar ongorulup exception olustugunda
         javanin ne yapmasini istedigimiz belirtilmelidir.
        1-Eger kodun calismasini istemiyorsak method isminin yanina olusabilecek exceptionu
        deklare edebiliriz
        2-kodun calismaya devam etmesini istiyorsak sorun olusturabilecek kodu try catch blogunun icine alir
        try bloguna sorun cikabilecek kodu catch bloguna olusabilecek exceptionu ve javanin
        ne yapmasini istedigimiz yazabiliriz...

        */
        String dosyaYolu = "src/day41_exception/dosya";
        try {
            FileInputStream fis = new FileInputStream(dosyaYolu);
            int k = 0;
            while ((k = fis.read()) != -1) {
                System.out.print((char) k);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        /*
      Exception lar arasinda parent child iliskisi mevcuttur.
      bir kod icin birden fazla exception olma ihtimali varsa oncelikle olasi exception lar parent child iliskisi
      tasiyor mu bakmamiz gerekir
      parent child iliskisi yoksa istedigimiz sirada catch cumleleri olusturabiliriz..
      Eger parent child iliskisi varsa sadece parent exception i yazabiliriz
      ikisinide yazmak istersek child i once parent i sonra yazmak gerekir...

         */

    }
}
