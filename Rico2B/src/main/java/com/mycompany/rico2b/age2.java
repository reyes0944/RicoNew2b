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
public class age2 {
    
    public static void main(String[] args){
        
        System.out.print ("Enter your age: ");
        Scanner input = new Scanner(System.in);
        
        int age = input.nextInt();
        
        if (age >=18 && age <=100)
        {
            System.out.print ("ABLE TO VOTE");
            
        }
        
        else if (age <=17 && age >=5)
        {
            System.out.print ("UNABLE TO VOTE");
        }
        
        else
        {
            System.out.print ("Invalid Input");
        }
    }
}
