/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rico2b;
import java.util.Scanner;
/**
 *
 * @author CL1-PC14
 */
public class cafeteria {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int hotdog = 25;
        int siomai = 14;

        boolean running = true;

        while (running) {
            System.out.println("\nCAFETERIA");
            System.out.println("Menu");
            System.out.println("[Snacks]");
            System.out.println("[1] - kwek kwek [35.00]");
            System.out.println("[2] - fried Siomai [20.00]");
            System.out.println("[0] - Exit");
            System.out.println();

            System.out.print("Enter your choice: ");
            int snacks = input.nextInt();

            if (snacks == 1) {
                System.out.println("kwekwek price is 35 pesos");
                System.out.print("Enter Quantity: ");
                int quan = input.nextInt();
                double subtotal = quan * hotdog;
                double vat = subtotal * 0.12;
                double total = subtotal + vat;

                System.out.println("Subtotal : " + subtotal);
                System.out.println("Tax (12%) : " + vat);
                System.out.println("Total : " + total);

                System.out.print("Enter your cash: ");
                double cash = input.nextDouble();
                double change = cash - total;

                System.out.println("Change : " + change);
            } else if (snacks == 2) {
                System.out.println("Fried siomai price is 20 pesos");
                System.out.print("Enter Quantity: ");
                int quan = input.nextInt();
                double subtotal = quan * siomai;
                double vat = subtotal * 0.12;
                double total = subtotal + vat;

                System.out.println("Subtotal : " + subtotal);
                System.out.println("Tax (12%) : " + vat);
                System.out.println("Total : " + total);

                System.out.print("Enter your cash: ");
                double cash = input.nextDouble();
                double change = cash - total;

                System.out.println("Change : " + change);
            } else if (snacks == 0) {
                System.out.println("Exiting... Thank you!");
                running = false; // exit the loop
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        input.close();
    }
}