package com.Conditionals_and_Loops.practice.Intermediate;

import java.util.Scanner;

public class perfectNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = in.nextInt();
        int sum = 0;
        for (int i = 1; i <= n/2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (sum == n) {
            System.out.println("The entered number is a perfect number");
        } else {
            System.out.println("The entered number is not a perfect number");
        }
    }
}
