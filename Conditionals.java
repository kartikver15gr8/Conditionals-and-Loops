package com.Conditionals_and_Loops;

import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        /*Everytime when there is a need to make choice
        * between two or more events in a program, we use conditional
        * statements.*/

    // The syntax of if statements
//        int salary = 5558880;
//        if (salary>5000000){
//            salary += 100000; // Same as writing salary = salary +100000
//
//        } else {
//            salary = salary+50000;
//        }
//        System.out.println(salary);

    // The syntax of using multiple if-else
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the salary: ");
        int salary = input.nextInt();
        if (salary>5000000 && salary<10000000){
            salary += 100000; // Same as writing salary = salary +100000

        } else if (salary > 10000000) {
            salary+=200000;

        }
        System.out.println(salary);
    }
}
