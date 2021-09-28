/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 alden bagarra
 */

/*
Let's play Guess the Number!

Enter the difficulty level (1, 2, or 3): 1
I have my number. What's your guess? 5
Too low. Guess again: 7
Too low. Guess again: 9
You got it in 3 guesses!

Do you wish to play again (Y/N)? y

Enter the difficulty level (1, 2, or 3): 3
I have my number. What's your guess? 500
Too low. Guess again: 750
Too high. Guess again: 600
Too low. Guess again: 700
Too low. Guess again: 725
Too high. Guess again: 715
Too high. Guess again: 710
Too high. Guess again: 705
Too high. Guess again: 701
Too low. Guess again: 702
You got it in 10 guesses!

Do you wish to play again (Y/N)? n
 */

package ex32;
import java.util.Scanner;

public class App {

    public static void main( String[] args )
    {
        Scanner scnN = new Scanner(System.in);
        System.out.println( "Let's play Guess the Number!" );
        System.out.print( "Enter the difficulty level (1, 2, or 3): " );
        int level = scnN.nextInt();
    }
}