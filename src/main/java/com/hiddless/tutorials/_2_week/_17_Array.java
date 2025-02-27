package com.hiddless.tutorials._2_week;

import com.hiddless._1_part_javatypes.ultis.SpecialColor;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class _17_Array {
    public static String[] arrayMethod1() throws ArrayIndexOutOfBoundsException {
        // String dizisi
        String[] city = new String[6]; // Eleman sayısı:10
        city[0] = "London";
        city[1] = "Warshaw";
        city[2] = "Ankara";
        city[3] = "New York";
        city[5] = "Oslo";
        //System.out.println(city);
        //System.out.println("Eleman sayısı: " + city.length);
        //System.out.println(city[0]);
        //System.out.println("Son Eleman: " + city[6 - 1]);
        System.out.println("Son Eleman: " + city[city.length - 1]);
        return city;
    }

    // iterative for döngüsü
    public static void arrayMethod3() {
        String[] city = arrayMethod1();
        // for each
        for (int i = 0; i < city.length; i++) {
            System.out.println(SpecialColor.PURPLE + city[i] + SpecialColor.RESET);
        }
    }

    // Foreach
    public static void arrayMethod4() {
        String[] city = arrayMethod1();
        // for each
        for (String temp : city) {
            System.out.println(SpecialColor.YELLOW + temp + SpecialColor.RESET);
        }
    }

    // Arrays.sort() Küçükten büyüğe doğru
    public static void arrayMethod5() {
        String[] city = arrayMethod1();

        // Dizilerde Sıralama (Küçükten Büyüğe Doğru sıralama)
        Arrays.sort(city);

        // for each u
        for (String temp : city) {
            System.out.println(SpecialColor.BLUE + temp + SpecialColor.RESET);
        }
    }

    // Arrays.sort() Büyükten küçüğe doğru
    public static void arrayMethod6() {
        String[] city = arrayMethod1();

        // Dizilerde Sıralama (Küçükten Büyüğe Doğru sıralama)
        Arrays.sort(city, Collections.reverseOrder());

        // for each
        for (String temp : city) {
            System.out.println(SpecialColor.CYAN + temp + SpecialColor.RESET);
        }
    }


    public static int randomNumber(){
        Random random= new Random();
        int rndInt= random.nextInt(9)+1;
        return rndInt;
    }

    // fill: metodu tek bir değeri dizinin tüm elemanlarına atamak için tasarlanmıştır.
    public static void arrayMethod7() {
        int[] number = new int[7];

        // iterative for
        Arrays.fill(number,randomNumber()); // 5 sayısı ile doldur

        // for each
        for (int temp : number) {
            System.out.println(SpecialColor.BLUE + temp + SpecialColor.RESET);
        }
    }



    // PSVM
    public static void main(String[] args) {
        //arrayMethod1();
        //arrayMethod3();
        //arrayMethod4();
        //arrayMethod5();
        //arrayMethod6();
        arrayMethod7();
    }
} //end class