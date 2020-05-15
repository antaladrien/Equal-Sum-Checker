package com.antaladrien;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = myObj.nextInt();
        System.out.println("Enter second number:");
        int num2 = myObj.nextInt();
        System.out.println("Enter third number:");
        int num3 = myObj.nextInt();

        System.out.println("The sum of the first and second number is equal to the third number");
        System.out.println(hasEqualSum(num1, num2, num3));
    }

    public static boolean hasEqualSum(int num1, int num2, int num3) {
        if (num1 + num2 == num3) {
            return true;
        }
        return false;
    }
}
