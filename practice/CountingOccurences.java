package com.Conditionals_and_Loops.practice;

import java.util.Scanner;

public class CountingOccurences {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = in.nextInt();
        System.out.println("Enter the digit of which you wanna get the occurrence: ");
        int i = in.nextInt();
        int count = 0;
        while(n>0){
            int rem = n%10;
            if(rem==i){
                count++;
            } n = n/10;
        }
        System.out.println("The occurrence of "+i+" is "+ count);
    }
}
