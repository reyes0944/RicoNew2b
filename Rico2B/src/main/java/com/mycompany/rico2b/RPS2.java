/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rico2b;
import java.util.Scanner;

/**
 *
 * @author ricor
 */
public class RPS2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("[1] = Rock");
        System.out.println("[2] = Paper");
        System.out.println("[3] = Scissor");
        System.out.print("Enter Player 1: ");
        int x = input.nextInt();
        System.out.print("Enter Player 2: ");
        int y = input.nextInt();
        
        if (x == 1 && y == 1)
        {
            System.out.print ("Draw");
        }
        else if (x == 1 && y == 2)
        {
            System.out.print ("Player 2 wins!");
        }
        else if (x == 1 && y == 3)
        {
            System.out.print ("Player 1 wins!");
        }
        else if (x == 2 && y == 1)
        {
            System.out.print ("Player 2 wins!");
        }
        else if (x == 2 && y == 2)
        {
            System.out.print ("Draw!");
        }
        else if (x == 2 && y == 3)
        {
            System.out.print ("Player 2 wins!");
        }
        else if (x == 3 && y == 1)
        {
            System.out.print ("Player 1 wins!");
        }
        else if (x == 3 && y == 2)
        {
            System.out.print ("Player 2 wins!");
        }
        else if (x == 3 && y == 3)
        {
            System.out.print ("Draw!");
        }
        else
            System.out.print ("Invalid input!");
    }
}
