package org.courses.hillel;

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        pascalTriangle();
    }

    public static void pascalTriangle() {
        int LINES = 0;
        System.out.println("Enter number of lines for Pascal Triangle: ");

        Scanner scanner = new Scanner(System.in);
        LINES = scanner.nextInt();

        int[][] a = new int[LINES][];
        a[0] = new int[1];
        a[1] = new int[2];
        a[1][0] = a[1][1] = 1;
        System.out.println(a[0][0] = 1);
        System.out.println(a[1][0] + " " + a[1][1]);
        for (int i = 2; i < LINES; i++) {
            a[i] = new int[i + 1];
            System.out.print((a[i][0] = 1) + " ");
            for (int j = 1; j < i; j++) {
                System.out.print((a[i][j] = a[i - 1][j - 1] + a[i - 1][j]) + " ");
            }
            System.out.println(a[i][i] = 1);
        }
    }
}
