/**
 * Java1.Lesson_1. HomeWork_1
 * @author Evdokimov Maksim
 * @version 12.08.18
 */

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a, d = 10;
        a = d;
        byte b = 2;
        long c = 100;
        char ch = '1';
        short s = 15;
        double df = 10.0d;
        float f = 12.0f;
        boolean tr = true;
        String str = "Maks";
        System.out.print("Task 3: ");
        System.out.println(task3(a, d, b, c));
        System.out.println();
        System.out.print("Task 4: ");
        System.out.println(task4(a, d));
        System.out.println();
        System.out.print("Task 5: ");
        task5(b);
        System.out.println();
        System.out.print("Task 6: ");
        System.out.println(task6(b));
        System.out.println();
        System.out.print("Task 7: ");
        task7(str);
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("Choose year: ");
        int year = scanner.nextInt();
        task8(year);
    }

    public static long task3(int a, int d, byte b, long c) {
        return (a * (b + (c / d)));
    }

    public static boolean task4(int a, int d) {
        if ((a + d >= 10) & (a + d) < 20) return true;
        else return false;
    }

    public static void task5(byte b) {
        if (b >= 0) System.out.println("Positive number:  " + b);
        else System.out.println("Negative number: " + b);
    }

    public static boolean task6(byte b) {
        if (b >= 0) return false;
        else return true;
    }
    public static void task7 (String str) {
        System.out.println("Your name - " + str);
    }
    public static void task8 (int year) {
        if (year%400==0) System.out.println("Год " + year + " высокосный!");
        else if ((year%100!=0) && (year%4==0)) System.out.println("Год " + year + " высокосный!");
            else System.out.println("Не высокосный!");
        }
}
