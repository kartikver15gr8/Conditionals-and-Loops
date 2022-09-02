package com.Conditionals_and_Loops;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        /*Loops are basically used when we need to perform
        * a specific task again and again for a number of times.
        * For example just suppose I have to make a program
        * that prints integers from 0 to 1000000, So in this case
        * if I try to do it manually then it will be like
        * a worst case scenerio or a nightmare so in these
        * kinds of problems loops came into play*/


        /*
        * Syntax of 'for' loops
        *
        * for(initialization; condition; increment/decrement){
        *   // body
        * }
        * */

//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the number you want to get multiplication table of: ");
//        int num = in.nextInt();
//        System.out.println("The multiplication table of " + num + " is: ");
//        for (int i = 1; i <= 10; i++){
//            System.out.print(num +" * "+i+ " = ");
//            System.out.println(num*i);
//        }

        /*
        * Syntax of 'while' loops
        *
        * while(condition){
        *   //body
        * }
        * */

//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the number of which you want to get the multiplication table of: ");
//        int num = in.nextInt();
//        int i = 1;
//        while(i<=10){
//            {
//                System.out.printf("%d * %d = %d \n", num, i, num * i);
//                i++;
//            }
//
//        }

        /*Syntax for 'do while' loops
        *
        * do{
        *   //body
        * }while(condition);
        * */

//            Scanner in = new Scanner(System.in);
//            System.out.println("Enter the number of which you want to get the multiplication table of: ");
//            int num = in.nextInt();
//            int i = 1;
//            do{
//                System.out.printf("%d * %d = %d \n", num, i, num * i);
//                i++;
//            }while (i<=10);

                /* Now a question may arise then when to use 'for' loops and when to use 'while' loops.
                * The answer is pretty simple and it is, when you know that how many times the loops is
                * going to execute, then use 'for' loops, and when you don't know that how many times the loop
                * is going to execute, then use 'while' loops
                *
                * For example: just suppose you have to print first 'n' integers, then in this case you know
                * that how many times the loops gonna run, so in this case you should use 'for' loops.
                *
                * on the other hand just suppose you have to make a program which must continuously take an integer input from
                * the user until unless the user provides an input apart from an integer say char or string, so in this
                * case you don't know that how many times the loop gonna execute so in this case you should use
                * 'while' loops.   As simple as that 😊😊*/
    }
}
