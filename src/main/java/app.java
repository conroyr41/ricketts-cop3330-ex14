/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Conroy Ricketts
 */

import java.util.Scanner;

public class app
{
    public static void main(String[] args)
    {
        Scanner scan;
        String output, state;
        double orderAmount, tax, total, taxRate;

        System.out.println("Enter the order amount:");
        scan = new Scanner(System.in);
        orderAmount = Double.parseDouble(scan.next());

        System.out.println("Enter the state:");
        scan = new Scanner(System.in);
        state = scan.next();

        output = String.format("Total: $%.2f", orderAmount);

        if(state.equals("WI"))
        {
            taxRate = 5.5;
            tax = (taxRate/100) * orderAmount;
            total = tax + orderAmount;
            output = String.format("Subtotal: $%.2f\nTax: $%.2f\nTotal: $%.2f", orderAmount, tax, total);
        }

        System.out.println(output);
    }
}