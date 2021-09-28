/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 alden bagarra
 */


package ex25;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static int getSpecialCharacterCount(String s) {
        if (s == null || s.trim().isEmpty()) {
            return 0;
        }
        Pattern p = Pattern.compile("[^A-Za-z0-9]");
        Matcher m = p.matcher(s);
        boolean b = m.find();
        if (b){
            return 1;
        }
        else
            return 0;
    }

    public static int passwordValidator(String password)
    {
        String number   = ".*[0-9].*";
        String alpha = ".*[a-zA-Z].*";
        if(password.matches(number) && password.length() < 8){
            return 0;
        }
        if(password.matches(alpha) && password.length() < 8){
            return 1;
        }
        if(password.matches(number) && password.matches(alpha) && password.length() >= 8 && getSpecialCharacterCount(password) == 0){
            return 2;
        }
        if(password.matches(number) && password.matches(alpha) && getSpecialCharacterCount(password) > 0 && password.length() >= 8){
            return 3;
        }
        return 0;
    }

    public static void main( String[] args )
    {
        String password = "";
        int strength = passwordValidator(password);
        if(strength == 0){
            System.out.print( "The password '"+ password +"' is a very weak password." );
        }
        if(strength == 1){
            System.out.print( "The password '"+ password +"' is a weak password." );
        }
        if(strength == 2){
            System.out.print( "The password '"+ password +"' is a strong password." );
        }
        if(strength == 3){
            System.out.print( "The password '"+ password +"' is a very strong password." );
        }
    }

}