/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rico2b;
import java.util.Scanner;
/**
 *
 * @author CL1-PC15
 */
public class add2 {
    
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("[1] = Add");
    System.out.println("[2] = Subtraction");
    System.out.println("[3] = Multiplication");
    System.out.println("[4] = Division");
    System.out.print ("Choose operator: ");
    int a = input.nextInt();
    System.out.print("Input number 1: ");
    int x = input.nextInt();
    System.out.print("Input number 2: ");
    int y = input.nextInt();
    
    
    if (a == 1)
        {
            System.out.println("You choose addition!");
            int sum = x + y;
            System.out.println("The answer is " + sum);
            
        }
    
    else if (a == 2)
        {
            System.out.println ("You choose subtraction!");
            int diff = x - y;
            System.out.println ("The answer is " + diff);
        }
    
    else if (a == 3)
        {
            System.out.println ("You choose multiplication!");
            int prod = x * y;
            System.out.println ("The answer is " + prod);
        }
    
    else if (a == 4)
        {
            System.out.println ("You choose division!");
            int quot = x / y;
            System.out.println ("The answer is " + quot);
        }
    else
            System.out.println ("Invalid input!");
    }
}
