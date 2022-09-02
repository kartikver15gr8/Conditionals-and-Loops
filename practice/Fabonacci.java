package com.Conditionals_and_Loops.practice;

import java.util.Scanner;

public class Fabonacci {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        System.out.println("Enter the count upto which you want to get the fabonacci series");
       int count = in.nextInt();
       int a=0,b=1,c,i;
        System.out.print(a + " " + b);
       for(i=2; i<=count; ++i){
           c = a+b;
           a = b;
           b = c;
           System.out.print(" " + c);

       }

    }
}
