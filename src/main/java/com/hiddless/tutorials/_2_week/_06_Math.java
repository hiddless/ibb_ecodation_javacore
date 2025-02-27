package com.hiddless.tutorials._2_week;

public class _06_Math {
    public static void main(String[] args) {
        // NaN: Not A Number
        System.out.println("En Küçük: "+Math.min(3,10));
        System.out.println("En Büyük: "+Math.max(-198,10));

        System.out.println("Mutlak Değer: "+Math.abs(-19));

        System.out.println("Karekök: "+Math.sqrt(25));
        System.out.println("Karekök: "+Math.sqrt(-25));

        System.out.println("Üslü Sayılar: "+Math.pow(4,6));

        System.out.println("Alta yuvarla: "+Math.floor(3.6));
        System.out.println("Üste yuvarla: "+Math.ceil(4.7));
        System.out.println("Ortalama al: "+Math.round(3.4)); //x>4 aşağı yuvarla

        System.out.println("Trigonometrik Sinüs; "+Math.sin(30));
        System.out.println("Cosinüs Al: "+Math.cos(60));
        System.out.println("Tanjant Al: "+Math.tan(270));


    }
}
