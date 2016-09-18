package org.courses.hillel;

import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int a = scanner.nextInt();

        System.out.println("Enter second number: ");
        int b = scanner.nextInt();

        System.out.println("Enter third number: ");
        int c = scanner.nextInt();

        if (a<b && a<c && c<b){
            System.out.println("Min:");
            System.out.println(a);
            System.out.println("Max:");
            System.out.println(b);
        }
        if (a<b && a<c && b<c){
            System.out.println("Min:");
            System.out.println(a);
            System.out.println("Max:");
            System.out.println(c);
        }
        else if(b<a && b<c && a<c){
            System.out.println("Min:");
            System.out.println(b);
            System.out.println("Max:");
            System.out.println(c);
        }
        else if(b<a && b<c && c<a){
            System.out.println("Min:");
            System.out.println(b);
            System.out.println("Max:");
            System.out.println(a);
        }
        else if(c<a && c<b && b<a){
            System.out.println("Min:");
            System.out.println(c);
            System.out.println("Max:");
            System.out.println(a);
        }
        else if(c<a && c<b && a<b){
            System.out.println("Min:");
            System.out.println(b);
            System.out.println("Max:");
            System.out.println(c);
        }
    }
}
