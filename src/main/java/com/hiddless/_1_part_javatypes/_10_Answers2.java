package com.hiddless._1_part_javatypes;

import java.util.Scanner;

// Santigrat (Celsius) - Fahrenheit Dönüştürücü
public class _10_Answers2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a Dereceyi girin: ");
        double a = scanner.nextDouble();

        if (a == 0) {
            System.out.println("32 Fahrenait");
        } else {
            double x = (a * 9/5) + 32 ;
            System.out.println("Fahrenait: x = " + x);
        }
        scanner.close();
    }
}
