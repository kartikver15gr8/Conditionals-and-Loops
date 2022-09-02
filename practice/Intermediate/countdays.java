package com.Conditionals_and_Loops.practice.Intermediate;

public class countdays {
    public static void main(String[] args) {
        int n = 31;
        int count = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
