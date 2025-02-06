package com.hiddless._1_part_javatypes;

public class _03_Variables {
    public static void main(String[] args) {
        // Veri değişken isimlerini yazarken
        /*
        veri isimlendirmeleri;
        1-) _ veya $ ile başlayabilirsiniz
        2-) isim sıfat veya zamir kullanılmaz
        3-) sayı ile bitebilir
        4-) sayı ile başlanmaz
        5-) _ veya $ dışında özel simgelerle başlanmaz
        6-) değişken isimlerini camelCase kuralına göre yazılır
         */

        //veri isimlendirmeleri
        // 1-) isim, veya sıfat, zamir kullanmamız lazım.
        int schoolNumber = 23;
        System.out.println(schoolNumber);
        schoolNumber=44;
        System.out.println(schoolNumber);

        int _schoolNumber=55;
        System.out.println(_schoolNumber);

        // 1-) _ veya $ ile başlayabilirsiniz
        int $schoolNumber=81;
        System.out.println($schoolNumber);

        // yazamayacaklarınız
        //int schoolNumber=11; // aynı isimde yazamazsın
        //int 81schoolNumber=11; // sayı ile başlayamazsın kullanamazsın
        //int ~schoolNumber=11; // özel simge başlanmaz
        //int ``schoolNumber=11; // gibi özel simgeler ilede başlanılmaz. SADECE $ VE _


    }
}
