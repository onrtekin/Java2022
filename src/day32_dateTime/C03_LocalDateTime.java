package day32_dateTime;

import java.time.LocalDateTime;

public class C03_LocalDateTime {
    public static void main(String[] args) {
        LocalDateTime tarih= LocalDateTime.now();
        System.out.println(tarih);//2022-03-31T22:35:28.695428100


        System.out.println(tarih.plusYears(3).plusMonths(2).plusDays(10).plusHours(5).plusMinutes(5));//2025-06-11T03:43:01.593130500
    }
}
