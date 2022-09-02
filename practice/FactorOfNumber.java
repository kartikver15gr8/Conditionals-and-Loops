package com.Conditionals_and_Loops.practice;

import java.util.Scanner;

public class FactorOfNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of which you want to get the factors of:");
        int num = in.nextInt();
        for (int i = 1; i <=num/2 ; i++) {
            if (num%i == 0){
                System.out.print(" " + i);
            }

        }

    }
}
