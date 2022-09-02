package com.Conditionals_and_Loops.practice;

import java.util.Scanner;

public class CurvedSurfaceAreaCylinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius and height of cylinder: ");
        float r = in.nextFloat();
        float h = in.nextFloat();
        float csa = 3.14f*r*r*h;
        System.out.println("The curved surface area of cylinder is: "+csa);

    }
}
