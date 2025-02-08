package com.hiddless._1_part_javatypes;

import java.util.Scanner;

public class _09_Answers1 {
    public static void main(String[] args) {

        //İlk sorunun cevabı

        Scanner scanner = new Scanner(System.in);

        // Kullanıcılardan a ve b değerlerini almak için
        System.out.println("a değerini girin: ");
        double a = scanner.nextDouble();

        System.out.println("b değerini girin: ");
        double b = scanner.nextDouble();

        // ax + b denklemini hesaplama
        if (a == 0) {
            if (b == 0) {
                System.out.println("Denklemin sonsuz çözümü var.");
            } else {
                System.out.println("Denklemin çözümü yok");
            }
        } else {
            double x = -b / a ;
            System.out.println("Denklemin çözümü: x = " + x);
            }
        scanner.close();
        }
    }

