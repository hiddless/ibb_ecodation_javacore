package com.hiddless._1_part_javatypes._2_week;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class _16_LocalTimeDate {
    public static void localDateFormatMethod1() {
        LocalDateTime now = LocalDateTime.now();
        Locale locale = new Locale("tr", "TR");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-mm-dd HH:mm:ss",locale);
        System.out.println("Şuandaki zaman: " + now);
        System.out.println("Şuandaki zaman: " + now.format(formatter));
    }

    public static void localDateFormatGetMethod2() {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Gün:"+now.getDayOfMonth());
        System.out.println("Kaçıncı Ay:"+now.getMonthValue());
        System.out.println("Yıl:"+now.getYear());
        System.out.println("Saat:"+now.getHour());
        System.out.println("Dakika:"+now.getMinute());
        System.out.println("Saniye:"+now.getSecond());
        System.out.println("######################################");

    }

    public static void localDateFormatSetMethod2() {
        Locale locale = new Locale("tr","TR");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-yyyy HH:mm:ss", locale);

        LocalDateTime now= LocalDateTime.now();
        LocalDateTime newData= now
                .withDayOfMonth(11)
                .withMonth(12)
                .withYear(2029)
                .withHour(14)
                .withMinute(44)
                .withSecond(23);
        System.out.println("Normal Tarih: "+now);
        System.out.println("Değiştirilmiş tarih: "+newData.format(formatter));

    }


    public static void main(String[] args) {
        localDateFormatMethod1();
        localDateFormatSetMethod2();
        localDateFormatGetMethod2();
    }
}
