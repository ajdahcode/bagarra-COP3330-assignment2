/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 alden bagarra
 */

package ex24;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static boolean isAnagram(String first, String second){
        if(first.length() != second.length()){
            return false;
        }
        char[] firstchr = first.toCharArray();
        char[] secondchr = second.toCharArray();
        Arrays.sort(firstchr);
        Arrays.sort(secondchr);
        if(Arrays.equals(firstchr, secondchr)){
            return true;
        }
        return false;
    }

    public static void main( String[] args )
    {
        Scanner scnN = new Scanner(System.in);
        System.out.println( "Enter two strings and I'll tell you if they are anagrams: " );
        System.out.print( "Enter the first string: " );
        String fstr = scnN.next();
        System.out.print( "Enter the second string: " );
        String sstr = scnN.next();

        if (isAnagram(fstr, sstr)){
            System.out.print( "\""+ fstr +"\" and \"" + sstr +"\" are anagrams." );
        }
        else{
            System.out.print( "\""+ fstr +"\" and \"" + sstr +"\" are not anagrams." );
        }
    }

}