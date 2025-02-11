package com.hiddless._1_part_javatypes;

import java.util.Scanner;

public class _Answer4_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pozitif bir sayı giriniz");
        int number = Math.abs(scanner.nextInt());
        int sum = 0;
                for (int i = 1; i <= number; i++) {
                    if (i == 47){
                        continue;
                    }
                    if (sum + i > 100) {
                        break;
                    }
                    sum += i;
                }

        System.out.println("Toplam: " + sum);
                scanner.close();
        if (number < 0) {
            number = number * (-1);
        }
        if (number % 2 == 0) {
            System.out.println("çift sayıdır");
        } else
            System.out.println("tektir");
    }
}
