package com.Conditionals_and_Loops.practice.Intermediate;

import java.util.Scanner;

public class AvgOfNNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        int count = 0;
        while (n != 0) {
            sum += n;
            System.out.println("Enter n");
            count++;
            n = in.nextInt();
        }
        float avg = sum/count;
        System.out.println(avg);
    }
}
