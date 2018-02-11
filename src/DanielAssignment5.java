
/*
 * Assignment 5
 * 
 * Meet the following Requirements:
 * Read unspecified number of integers from the console.
 * Determine how many positive and negative values have been read.
 * Computes the total of the input values (not counting zeros).
 * Computes the average of the input values (not counting zeros). 
 * Your program ends with the input 0. 
 * Display the average as a floating-point number.
 * 
 * @author Daniel de Sao Jose (991500928)
 */

import java.util.Scanner;

public class DanielAssignment5 {
    public static void main(String[] args){
        
        // Instantiate Scanner class instance.
        Scanner stdin = new Scanner(System.in);
        
        // Declare variables.
        int numberCounter = 0;
        int positiveNumberCounter = 0;
        int negativeNumberCounter = 0;
        int numberTotal = 0;
        int numberSubmitted = 1;
        
        // Main input loop.
        while (numberSubmitted != 0) {
            
            // Prompt the user for a number.
            System.out.print("Enter an integer, the input ends if it is zero:");
            numberSubmitted = stdin.nextInt();
            
            // Increment the number Counter
            if (numberSubmitted != 0) numberCounter++;
            
            // Increment positive number counter if positive.
            if (numberSubmitted > 0) positiveNumberCounter++;
            
            // Increment negative number counter if negative.
            if (numberSubmitted < 0) negativeNumberCounter++;
            
            // Add the submitted number to the total.
            numberTotal += numberSubmitted;
            
        }
        
        // Print out special message if the total is zero.
        if (numberTotal == 0 && numberCounter == 0) {
            System.out.println("No numbers entered except 0");
        }
        else {
            System.out.println("Number of positives is " + positiveNumberCounter);
            System.out.println("Number of negatives is " + negativeNumberCounter);
            System.out.println("The total is " + (double)numberTotal);
            System.out.println("The average is " + (numberTotal / numberCounter));
        }
       
    }
    
}
