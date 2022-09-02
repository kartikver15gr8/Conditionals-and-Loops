package com.Conditionals_and_Loops.practice;

import java.util.Scanner;

public class ReversingAString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = "Kartikey", nstr = "";
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            nstr = ch + nstr;
        }
        System.out.println("Reversed word: "+ nstr);
    }
}
