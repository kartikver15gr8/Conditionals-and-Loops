package com.Conditionals_and_Loops.practice;

import java.util.Scanner;

public class CalculateElectricityBill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Power consumed by the user per hour in a day: ");
        float power = in.nextFloat();
        System.out.println("Enter the time in hours: ");
        float time = in.nextFloat();
        System.out.println("Enter the rate at which the electricity is provides per unit: ");
        float rate = in.nextFloat();
        float netPower = power*time*30;
        float units = netPower/1000;
        float Cost = units*rate;
        System.out.println("The electricity bill of this month is of: Rs "+Cost+"/- ");

    }
}
