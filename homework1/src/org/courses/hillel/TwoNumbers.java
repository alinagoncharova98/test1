package org.courses.hillel;

import java.util.Scanner;

public class TwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int a = scanner.nextInt();

        System.out.println("Enter second number: ");
        int b = scanner.nextInt();

        if( a % b == 0){
            System.out.println("YES");
        }
        else System.out.println("NO");
    }
}
