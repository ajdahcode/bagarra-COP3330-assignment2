/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 alden bagarra
 */


package ex27;
import java.util.Scanner;


public class App {
    public static void validateInput(String first, String last, int zipC, String eID){
        String number = ".*[0-9].*";
        String alpha = ".*[a-zA-Z].*";
        if(first.length() < 2){
            System.out.println( "The first name must be at least 2 characters long." );
        }
        if(first.length() == 0){
            System.out.println( "The first name must be filled in." );
        }
        if(last.length() < 2){
            System.out.println( "The last name must be at least 2 characters long." );
        }
        if(last.length() == 0){
            System.out.println( "The last name must be filled in." );
        }
        if(eID.matches(alpha) && eID.matches(number)){
            System.out.println( "The first name must be at least 2 characters long." );
        }
        if(eID.length() == 0){
            System.out.println( "The employee ID must be filled in." );
        }
        if(String.valueOf(zipC).length() == 0){
            System.out.println( "The zipCode must be filled in." );
        }
        if(String.valueOf(zipC).length() != 5){
            System.out.print( "The zipcode must be a 5 digit number." );
        }
        else{
            System.out.print( "There were no errors found." );
        }
    }

    public static void main( String[] args )
    {
        Scanner scnN = new Scanner(System.in);
        System.out.print( "Enter the first name: " );
        String firstN = scnN.nextLine();
        System.out.print( "Enter the last name: " );
        String lastN = scnN.nextLine();
        System.out.print( "Enter the ZIP code: " );
        int zip = scnN.nextInt();
        System.out.print( "Enter the employee ID: " );
        String empID = scnN.next();

        validateInput(firstN, lastN, zip, empID);

    }
}