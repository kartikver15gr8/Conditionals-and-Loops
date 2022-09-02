package com.Conditionals_and_Loops.practice;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        float r = in.nextFloat();
        double area = 3.14*r*r;
        double perimeter = 2*3.14*r;
        System.out.println("The area of circle is : "+area+" and the perimeter of circle is "+perimeter);
    }
}
