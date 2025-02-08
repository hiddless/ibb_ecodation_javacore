package com.hiddless;

import java.util.Scanner;

public class _07_Scanner {
    public static void main(String[] args) {
        // Field
        String name,surname,sentence;

        //kullanıcıdan veri almak istiyorsak
        Scanner klavye= new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Adınızı girin: ");
        String ad = scanner.next();  // Tek kelime okur

        System.out.print("Soyadınızı girin: ");
        String soyad = scanner.next();  // Tek kelime okur

        System.out.print("Cümlenizi girin: ");
        scanner.nextLine(); // Önceki enter'ı temizler
        String cumle = scanner.nextLine(); // Bütün satırı okur

        System.out.println("Adınız: " + ad);
        System.out.println("Soyadınız: " + soyad);
        System.out.println("Girdiğiniz cümle: " + cumle);


        scanner.close();

    }
}
