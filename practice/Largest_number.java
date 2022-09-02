package com.Conditionals_and_Loops.practice;

import java.util.Scanner;

public class Largest_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a = in.nextInt();
        System.out.println("Enter the value of b: ");
        int b = in.nextInt();
        System.out.println("Enter the value of c: ");
        int c = in.nextInt();

        if (a>b && a>c){
            System.out.println("a is the largest number among a, b and c");
        } else if (a<b && c<b){
            System.out.println("b is the largest number among a, b and c");
        }else {
            System.out.println("c is the largest number among a, b and c");
        }
    }
}
