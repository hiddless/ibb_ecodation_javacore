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

        // Contains (X kelime geçiyor mu?)
        System.out.println("Geçiyor mu? "+vocabulary2.contains("Boom"));

        // Replace (değiştirmek)
        System.out.println("Değiştir: "+vocabulary2.replace("Boom","Tommy"));

        // Birleştirme
        System.out.println(vocabulary1.concat("pool").concat("81"));

        // String builder
        StringBuilder stringBuilder= new StringBuilder();
        stringBuilder.append(vocabulary1).append("pool").append("81");
        String dataToString= stringBuilder.toString();
        System.out.println(dataToString);

        // String Buffer (daha eski ve yavaş.Thread saver yapar. Daha güvenli)
        StringBuffer stringBuffer= new StringBuffer();
        stringBuffer.append(vocabulary1).append("pool").append("81");
        String dataToString2= stringBuffer.toString();
        System.out.println(dataToString2);

        // Hash Code
        System.out.println(vocabulary1.hashCode());
        System.out.println(vocabulary2.hashCode());
    }
}
