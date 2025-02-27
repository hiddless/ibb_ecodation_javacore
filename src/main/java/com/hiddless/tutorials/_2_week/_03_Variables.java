package com.hiddless.tutorials._2_week;

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
        // Anlamlı ve açıklayıcı isimler seç.

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
        //SystemOut school-Number // gibi kebab-case kullanılmaz
        // int school_number= 66; // yazarken boşluk kullanılmaz

        // yazma
        float totalsalary=14.54323f;
        System.out.println(totalsalary);

        // SABIT
        final int MAX_STUDENTS=100;
        System.out.println(MAX_STUDENTS);

    }
}
