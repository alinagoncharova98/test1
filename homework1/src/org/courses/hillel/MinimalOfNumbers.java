package org.courses.hillel;

import java.util.Scanner;

public class MinimalOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int a = scanner.nextInt();

        System.out.println("Enter second number: ");
        int b = scanner.nextInt();

        System.out.println("Enter third number: ");
        int c = scanner.nextInt();

        if (a < b && a < c) {
            System.out.println("Minimal of numbers: " + a);
        } else if (c < b && c < a) {
            System.out.println("Minimal of numbers: " + c);
        } else {
            System.out.println("Minimal of numbers: " + b);
        }
    }
}
