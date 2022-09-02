package com.Conditionals_and_Loops.practice;

import java.util.Scanner;

public class SumOfIntegersTillUserPressesZero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the integer: ");
        int num = in.nextInt();
        int i = 0;
        while(num!=0){
            i = i+num;
            System.out.println(i);
            System.out.println("Enter the Integer: ");
            num = in.nextInt();
        }

    }
}
