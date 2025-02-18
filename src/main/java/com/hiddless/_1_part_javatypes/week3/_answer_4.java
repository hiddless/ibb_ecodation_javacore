package com.hiddless._1_part_javatypes.week3;

import com.hiddless._1_part_javatypes.ultis.SpecialColor;

import java.util.Scanner;

public class _answer_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int number=scanner.nextInt();

        if (number <0) {
            System.out.println(SpecialColor.RED +"Negatif sayıların faktöriyeli yoktur.");
            number = Math.abs(number);
        }else if (number==0){
            System.out.println("Cevap 1");
        }

        int faktoriyel = 1;
        for (int i = 1; i<= number; i++) {
            faktoriyel *=i;
        }
        System.out.println(number + SpecialColor.BLUE+ "! = "+ faktoriyel);
        scanner.close();

    }
}
