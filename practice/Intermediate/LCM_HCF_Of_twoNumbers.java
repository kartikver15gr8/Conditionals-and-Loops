package com.Conditionals_and_Loops.practice.Intermediate;

import java.util.Scanner;

public class LCM_HCF_Of_twoNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int HCF = 0;

        for (int i = 1; i <= num1 / 2; i++) {
            for (int j = 1; j <= num2 / 2; j++) {
                if (num1 % i == 0 && num2 % j == 0 && i == j) {
                    HCF = i;
                }
            }
        }
        int lcm = (num1 * num2) / HCF;
        System.out.println("The LCM of " + num1 + " and " + num2 + " is " + lcm);
        System.out.println("The HCF of " + num1 + " and " + num2 + " is " + HCF);
    }
}
