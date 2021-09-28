/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 alden bagarra
 */

/*
What is your balance? 5000
What is the APR on the card (as a percent)? 12
What is the monthly payment you can make? 100
It will take you 70 months to pay off this card.

n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
 */

package ex26;
import java.util.Scanner;
import java.lang.Math;

public class App {
    public static double calculateMonthsUntilPaidOff(double i, double b, double p){
        i = i/365;
        double firstlog = Math.log10(1 + (b/p) * Math.pow(1 - (1 + i), 30));
        double n = (int) (-(1/30) * (firstlog / Math.log10(1 + i)));
        return n;
    }


    public static void main( String[] args )
    {
        Scanner scnN = new Scanner(System.in);
        System.out.print( "What is your balance? " );
        int balance = scnN.nextInt();
        System.out.print( "What is the APR on the card (as a percent)? " );
        int apr = scnN.nextInt();
        System.out.print( "What is the monthly payment you can make? " );
        int monP = scnN.nextInt();
        System.out.print( "It will take you "+ calculateMonthsUntilPaidOff(apr, balance, monP) +" months to pay off this card." );
    }
}