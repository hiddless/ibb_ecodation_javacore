package com.hiddless.tutorials._2_week;

import java.util.Formatter;

public class _13_2_StringFormat {
    /*
    ⚠️ Önemli Notlar
    ❌ Eclipse gibi IDE'lerde ANSI renkleri desteklenmez.
    ✅ Terminal, IntelliJ IDEA ve VS Code Terminal'de çalışır.
    ✅ Windows 10+ veya Linux/macOS’ta desteklenir.
    ✅ Windows'ta CMD yerine PowerShell veya Windows Terminal kullanmalısınız.
     */
    public static final String RESET = "\033[0m";  // Renk sıfırlama
    public static final String RED = "\033[31m";   // Kırmızı
    public static final String GREEN = "\033[32m"; // Yeşil
    public static final String YELLOW = "\033[33m";// Sarı
    public static final String BLUE = "\033[34m";  // Mavi
    public static final String PURPLE = "\033[35m";// Mor
    public static final String CYAN = "\033[36m";  // Açık Mavi
    // formatter 1
    public static void formatter1(){
        // Eğer new Formatter yazarsak close() ile manuel kapamak zorudayız.
        Formatter formatter= new Formatter();
        formatter.format("Merhabalar Adınız : %s, T.C: %d, Fiyat: %f ","Sophie",81742382,19.81);
        System.out.println(formatter);
        formatter.close(); // Belleği serbest bırakma
    }
    // formatter 2
    public static void formatter2(){
        //Formatter formatter= new Formatter();
        //Eğer string.format() yazarsak kapatmak zorunda değiliz. GC(Garbage Collection) otomatiktir
        String formatterString = String.format("Merhabalar Adınız : %s, T.C: %d, Fiyat: %f ","Sophie",81742382,19.81);
        System.out.println(formatterString);
        System.out.println(BLUE+formatterString+RESET);


    }
    // formatter 3 (Best Practice)
    public static void formatter3(){
        String name="Sophie";
        int tcNumber= 129323;
        double price = 26.75;
        System.out.printf("Merhabalar Adınız: %s, T.C: %d, Fiyat: %f ", name , tcNumber , price);
        System.out.println();
        System.out.printf("Merhabalar Adınız: %10s, T.C: %d, Fiyat: %f ", name , tcNumber , price); //%10s: Sağdan 10 karakter
        System.out.printf("Merhabalar Adınız: %-15s, T.C: %d, Fiyat: %f ", name , tcNumber , price); //%-10s: sola doğru yasla



    }

    // formatter 4
    public static void formatter4() {
         System.out.printf("Merhabalar Adınız: %s, T.C: %d, Fiyat: %f ", "Sophie", 11223344, 44.23);

    }

    public static void main(String[] args) {
        formatter1();
        formatter2();
        formatter3();
        formatter4();
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
