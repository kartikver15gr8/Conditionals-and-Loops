package com.Conditionals_and_Loops.practice;

import java.util.Scanner;

public class ReversingANumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = in.nextInt();
        int ans = 0;
        int digit;

        while (n>0){
            int rem = n%10;
            ans = (ans*10)+rem;
            n = n/10;
        }
        System.out.println("The reverse of the number "+"is "+ans);
    }
}
