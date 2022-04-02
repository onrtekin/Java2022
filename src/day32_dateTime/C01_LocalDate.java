package day32_dateTime;

import java.time.LocalDate;
import java.time.ZoneId;

public class C01_LocalDate {
    public static void main(String[] args) {
        LocalDate trh=LocalDate.now();//objenin olusturuldugu tarihi trh ye atar
        LocalDate baskaTrh=LocalDate.of(1982,4,26);
        //istedigimiz ay gun yil degerlerine gore bize obje olusturur.
        System.out.println(trh);
        System.out.println(baskaTrh);

        //get li metodlarla tarih ile ilgili detay bilgileri alabiliriz
        System.out.println(trh.getDayOfMonth());
        System.out.println(trh.getDayOfWeek());
        System.out.println(trh.getMonthValue());
        System.out.println(trh.getDayOfYear());
        System.out.println(trh.getChronology());
        // bir tarihten istedigimiz kadar ileri geri gidebiliriz
        System.out.println(trh.minusWeeks(20).minusDays(3));
        System.out.println(trh.plusMonths(9).plusDays(10));
        //tarih dile gore degismez
        LocalDate trhZone=LocalDate.now(ZoneId.of("Japan"));
        System.out.println(trhZone);
        // is ile baslayanlar boolean sonuclar dondurur
        System.out.println(LocalDate.now().isLeapYear());
        System.out.println(trh.isAfter(baskaTrh));

    }
}
