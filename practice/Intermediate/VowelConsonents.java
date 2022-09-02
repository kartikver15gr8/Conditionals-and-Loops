package com.Conditionals_and_Loops.practice.Intermediate;

import java.util.Scanner;

public class VowelConsonents {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ) {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }
    }
}
