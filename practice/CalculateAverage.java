package com.Conditionals_and_Loops.practice;

import java.util.Scanner;

public class CalculateAverage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number:");
        float num = in.nextFloat();
        float sum = 0;
        int count = 0;
        while (num > 0) {
            if (num != 0) {
                sum = sum+num;
                count++;
                System.out.println("Enter the number:");
                num = in.nextInt();
            }
        }float avg = sum/count;
        System.out.println("The average of all the numbers input by user is: " + avg);
    }
}
