package com.Conditionals_and_Loops.practice;

import java.util.Scanner;

public class PowerInJava {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = in.nextInt();
        int temp =1;
        System.out.println("Enter the exponent:");
        int exp = in.nextInt();
        for (int i = 1; i <=exp ; ++i) {
            temp = temp*num;
        }
        System.out.println("The result is: " + temp);
    }
}
