package com.hiddless._1_part_javatypes._2_week;

import java.util.Scanner;

public class _11_Conditional4 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("lütfen sayı gir");
        int number=scanner.nextInt();

        switch (number) {
            case 1:
                System.out.println("sayı 1");
                break;
            case 2:
                System.out.println("sayı 2");
                break;
            case 3:
                System.out.println("sayı 3");
                break;
            case 4:
                System.out.println("sayı 4");
                break;
            case 5:
                System.out.println("sayı 5");
                break;
            default:
                System.out.println(number + " 1<=NUMBER<=5 dışındadır");
                break;

        }
    }
}
