package com.Conditionals_and_Loops.practice.Intermediate;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = in.nextInt();
        int original = n;
        int sum = 0;
        while (n > 0) {
            int rem = n%10;
            sum = sum * 10 + rem;
            n /= 10;    // n = n/10
        }
        if (sum == original) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
