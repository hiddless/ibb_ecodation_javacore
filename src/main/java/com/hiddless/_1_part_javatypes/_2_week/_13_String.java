package com.hiddless._1_part_javatypes._2_week;

public class _13_String {
    public static void main(String[] args) {
        String vocabulary1 = "Tom'u seviyorum";
        String vocabulary2 = "Boom Shaka Laka";
        System.out.println("Harf Sayısı: " + vocabulary1.length());
        System.out.println("Küçük Harfle Yaz: " + vocabulary1.toLowerCase());
        System.out.println("Büyük Harfle Yaz: " + vocabulary1.toUpperCase());

        System.out.println("Harf Sayısı: " + vocabulary2.length());
        System.out.println("Küçük Harfle Yaz: " + vocabulary2.toLowerCase());
        System.out.println("Büyük Harfle Yaz: " + vocabulary2.toUpperCase());

        // equals
        System.out.println(vocabulary1== vocabulary2);
        System.out.println(vocabulary1.equals(vocabulary2));

        // trim
        System.out.println("Trim: " + vocabulary1.trim().length());
        System.out.println("Trim: " + vocabulary1.trim());

        // ile mi başlıyor
        System.out.println(vocabulary1.startsWith("T") + "T ile mi başlıyor");
    }
}
