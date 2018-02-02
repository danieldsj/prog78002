/**
 * Modify the code SimpleIfDemo.java to provide some answer if the number input 
 * is not a 5 or is not a 2.  Is there another way to combine the if constructs 
 * to account for all combinations of multiples of 5, even numbers, and all 
 * other numbers?
 * 
 * @author Daniel de Sao Jose (991500928)
 */


// Import the Scanner class
import java.util.Scanner;

public class DanielClassExercise2 {
    
    public static void main(String[] args) {
        
        // Create an instance of the Scanner class using the system input.
        Scanner standardInput = new Scanner(System.in);
        
        // Prompt the user for an integer.
        System.out.print("Enter an integer: ");
        
        // Place the user input into a new integer varibale called "number".
        int number = standardInput.nextInt();
        
        // If the integer is a multiple of 5
        if (number % 5 == 0) {
            
            // Print the text "HiFive!".
            System.out.println("HiFive!");
        }
        else if (number % 2 == 0) {
            
            // Print the text "HiTwo!".
            System.out.println("HiTwo!");
        }
        else {
            
            // Print all other numbers output.
            System.out.println("The number is not divisible by 5 or 2");
        }
        
        
    }
    
    
}
