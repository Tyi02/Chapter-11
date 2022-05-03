package com.CSCI185;

public class Countdown {
    public static void main(String[] args) {
        countdown(5);
    }
    public static void countdown(int n){

        //base case
        if(n==0){
            System.out.println(n);;
        }

        //recursive case
        else{
            System.out.println(n);
            countdown(n-1);

            //reverse
            //counts starting from 0 -5
            //countdown(n-1);
            //System.out.println(n);
        }
    }
}