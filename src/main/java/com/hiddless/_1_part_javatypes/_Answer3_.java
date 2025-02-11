package com.hiddless._1_part_javatypes;

import java.util.Scanner;

public class _Answer3_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int number=scanner.nextInt();
        if (number > 0)
            System.out.println("Pozitif sayıdır");
        else
            System.out.println("Negatif sayıdır");
    }
}
