package com.Conditionals_and_Loops.practice.Intermediate;

import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = in.nextInt();
        isArmstrong(n);
    }

    static void isArmstrong(int n) {
        int original = n;
        int sum = 0;
        while (n != 0) {
            int rem = n%10;
            sum += rem * rem * rem;
            n = n / 10;
        }
        if (sum == original) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }

}
