package com.Conditionals_and_Loops.practice;

import java.util.Scanner;

public class AlphabetCaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the character you wish to check whether it is an Uppercase or Lowercase: ");
        char a = in.next().trim().charAt(0);    // We used in.next() to take the first word which is input by the user, and then we used .trim() to remove extra spaces in the starting and ending of word if they exists, and we used charAt(0) to return the character which is at the zeroth index of the input string.
        System.out.println(a);
        if (65 <= a && a <= 90){
            System.out.println("The input character is an Uppercase");
        } else if (97 <= a && a <= 122) {
            System.out.println("The input character is an Lowercase");
        }else {
            System.out.println("The input is not an alphabet!");
        }
    }
}
