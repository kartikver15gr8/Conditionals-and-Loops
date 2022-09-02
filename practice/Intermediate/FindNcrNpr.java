package com.Conditionals_and_Loops.practice.Intermediate;

import java.util.Scanner;

public class FindNcrNpr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = in.nextInt();
        System.out.println("Enter r:");
        int r = in.nextInt();
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_n_r = factorial(n - r);

        float Npr = (float)(fact_n/fact_n_r);
        float Ncr = (float) (fact_n / (fact_r * fact_n_r));
        System.out.println("The Npr is: " + Npr);
        System.out.println("The Ncr is: " + Ncr);


    }

    static int factorial(int n) {
        int fact = 1;
        if (n == 0 || n == 1) {
            return n;
        }else {
            for (int i = 2; i <= n; i++) {
                fact = fact*i;
            }
        }return fact;

    }

}
