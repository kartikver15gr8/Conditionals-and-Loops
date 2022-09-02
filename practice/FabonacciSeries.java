package com.Conditionals_and_Loops.practice;

import java.util.Scanner;

public class FabonacciSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number upto which you need to get the fabonacci series:");
        int num = in.nextInt();
        int a = 0, b = 1, c;
        System.out.print(a + " " + b);
        for (int i = 2; i <= num; ++i) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(" " + c);

        }

    }
}
