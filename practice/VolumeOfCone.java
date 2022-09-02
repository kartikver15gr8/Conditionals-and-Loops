package com.Conditionals_and_Loops.practice;

import java.util.Scanner;

public class VolumeOfCone {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of radius of cone: ");
        double r = in.nextDouble();
        System.out.print("Enter the value of height of cone: ");
        double h = in.nextDouble();
        double vol = 1.046666*r*r*h;
        System.out.println("The volume of the cone is: "+vol);


        }
    }

