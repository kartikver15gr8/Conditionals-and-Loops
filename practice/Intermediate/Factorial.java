package com.Conditionals_and_Loops.practice.Intermediate;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = in.nextInt();
        int fact = 1;
        if (n == 0 || n == 1) {
            System.out.println(n);
        } else {
            for (int i = 2; i <= n; i++) {
                fact = fact*i;
            }
            System.out.println("The factorial of " + n + " is " + fact);
        }

    }
}
