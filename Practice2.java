package com.CSCI185;
//Write a Recursive Method that calculates n!


import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a power: ");
        int num = keyboard.nextInt();


        System.out.println(getFactorial(num));
    }
    public static int getFactorial(int n)
    {
        if(n<=1)
        {
            return 1;
        }
        else
        {
            return n * getFactorial(n-1);
        }
    }
}