package com.Conditionals_and_Loops.practice.Intermediate;

import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        String revstr = "";
        for (int i = 1; i <= str.length(); i++) {
            revstr += str.charAt(str.length() - i);
        }
        System.out.println(revstr);
    }
}
