package DayOne;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;

/**
 *
 * @author Joseph
 */
public class RockPaperScissors 
{
    public static void main(String[] args)
    {
        // prompt user for starting game
        System.out.println("Hello Game Player, choose your weapon");
        
        // let user choose
        Scanner scn = new Scanner(System.in);
        String UserWeapon = scn.next();
        System.out.println("You choose " + UserWeapon);
        
        // Computer Chooses
        Random gen = new Random();
        int randomlyGenerated = gen.nextInt(3); // 0 represents loss, 1 tie, 2 win
        
        // see whether computer wants you to win, lose, or tie
        if(randomlyGenerated == 1)
        {
            System.out.print("You tied!");
        }
        else if(randomlyGenerated == 0)
        {
            System.out.print("You lost!");
        }
        else
        {
            System.out.print("You won!");
        }
    }
}
