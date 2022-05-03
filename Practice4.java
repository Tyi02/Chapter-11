package com.CSCI185;

import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = keyboard.nextInt();
        System.out.println(recursiveFid(num));

    }
    public static int recursiveFid(int n)
    {
        if(n == 0)
        {
            return 0;
        }
        else if(n == 1)
        {
            return 1;
        }
        else
            return recursiveFid(n-1)+recursiveFid(n-2);
    }
}
