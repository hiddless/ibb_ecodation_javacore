package com.hiddless._1_part_javatypes._2_week;

import java.util.Formatter;

public class _17_Array {

    // formatter 1
    public static void formatter1(){
        Formatter formatter= new Formatter();
        formatter.format("Merhabalar Adınız : %s, T.C: %d, Fiyat: %f ","Sophie",81742382,19.81);
        System.out.println(formatter);
        formatter.close(); // Belleği serbest bırakma
    }
    // formatter 2
    public static void formatter2(){
        //Formatter formatter= new Formatter();
        String formatterString = String.format("Merhabalar Adınız : %s, T.C: %d, Fiyat: %f ","Sophie",81742382,19.81);
        System.out.println(formatterString);
    }
    // formatter 3
    public static void formatter3() {

    }

    public static void main(String[] args) {
        formatter1();
        formatter2();
        formatter3();
        // Formatter
        // s
        // d
        // f

        /*
        Garbage Collectors:
        Yalnızca ama yalnızca kapalı olmayan dosya, scanner,formatter vb
        Yapılarında otomatik kapanmaz eğer biz bunu manuel olarak kapatmazsak
        bu kapatılmayan nesneyi temizleyebilir ancak açık olan dosyayı kapatmaz.
         */
    }
}
