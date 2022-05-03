package com.CSCI185;

public class Practice3 {
    public static void main(String[] args) {
      //  System.out.println(iterativeNumDigits(156));
        System.out.println(recursiveNumDigits(4532));
    }

    public static int iterativeNumDigits(int n)
    {
        int count = 0;
        while(n > 0) //repeat this pricess until all digits are accounted for
        {
            n = n /10; //remove the last digit
            count++; //keep track of each removed digit(thereby counting digits)
        }
        return count; //return the number of digits
    }
    public static int recursiveNumDigits(int n)
    {
        if(n < 10)          //return 1 once we are at the last digit
        return 1;
        return 1 + recursiveNumDigits(n/10);  //remove a digit add 1 to the counter
    }
}
