package com.Conditionals_and_Loops.practice;

import java.util.Scanner;

public class SubtractProAddOfIntegers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Integer: ");
        int num = in.nextInt();
        int a = 0, b = 1;
        while (num>0){
            int rem = num%10;
            a = a + rem;
            b = b * rem;
            num = num/10;
        }int ans = b-a;
        System.out.println("The subtraction of Product and Sum of Digits of given inter is: "+ ans);
    }
}
