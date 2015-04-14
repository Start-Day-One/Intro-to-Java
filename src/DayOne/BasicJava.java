package DayOne;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joseph
 * Hello Joseph, you are very awesome
 * 
 */

import java.util.Random;
import java.util.Scanner;

public class BasicJava 
{
    /*
    
    Essential
    booleans    -> true, false
    integers      -> -2, -1, 0, 1, 2 
    doubles      -> -2.00, -1.00, 0.0, 1.0, 2.0
    characters  -> 'A', 'B', 'a', 'b', '!', '#', '$'
    
    */
    
    public static void main(String[] args)
    {
        // TODO LIST
        boolean toasterButton = true;
        boolean toasterPower = false;
                
        if(toasterPower)
        {
            if(toasterButton)
            {
                // Do stuff here when toasterbutton is true
                // heat up and toast bread
            }
            else if(toasterButton == false)
            {
                toasterButton = true;
            }
        }
        else if(toasterPower == false)
        {
            toasterPower = true;
        }
        
        // Math stuff
        int bigNumber = Integer.MAX_VALUE; // 2^31-1
        int smallNumber = Integer.MIN_VALUE;  // -2^31
        
        int newNumber = bigNumber + smallNumber - 400;
        double coolNumber = 2 + 2.00;
        //System.out.print(coolNumber);
        
        // Characters
        char A = 'A';
        char littleB = 'b';
        
        
        //System.out.print(A + "" + littleB);
        
        // Strings
        String twoCharacters = A + "" + littleB;
        String MyName = "Joseph Zhong";
        System.out.println(twoCharacters);
        System.out.println("");
        
        /**
         * booleans, integers, doubles, and characters are primitive
         * Strings are reference types
         */
        
        Random NumberGenerator = new Random();
        int randomlyGenerated = NumberGenerator.nextInt(3);
        System.out.println(randomlyGenerated);
        
        int randomlyGenerated2 = (int)Math.round((Math.random()) * 3);
        System.out.println(randomlyGenerated2);
        
        // Scanner Input stuff
        Scanner consoleScanner = new Scanner(System.in);
        System.out.print("Hello Joseph, please type your name ");
        String input = consoleScanner.next();
        System.out.print(input);
    }
    
}
