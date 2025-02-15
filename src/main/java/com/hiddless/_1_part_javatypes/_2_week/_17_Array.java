package com.hiddless._1_part_javatypes._2_week;

import java.util.Formatter;

public class _17_Array {

    public static void formatter1(){
        Formatter formatter= new Formatter();
        formatter.format("Merhabalar Adınız : %s, T.C: %d, Fiyat: %f ","Sophie",81742382,19.81);
        System.out.println(formatter);
        formatter.close(); // Belleği serbest bırakma
    }
    public static void main(String[] args) {
        formatter1();
        // Formatter
        // s
        // d
        // f
    }
}
