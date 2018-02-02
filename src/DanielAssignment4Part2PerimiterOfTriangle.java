
/**
 * Reads three edges for a triangle and computes the perimeter if the input is 
 * valid. Otherwise, display that the input is invalid.  The input is valid if 
 * the sum of every pair of two edges is greater than the remaining edge.
 *
 * @author Daniel de Sao Jose (991500928)
 */

import java.util.Scanner;

public class DanielAssignment4Part2PerimiterOfTriangle {
    
    public static void main(String[] args) {
        
        // Utility objects
        Scanner in = new Scanner(System.in);

        // Input variables
        int edge1;
        int edge2;
        int edge3;
        
        // Output variables
        boolean isValid;
        int perimeter;

        // Prompt user for inputs.
        System.out.println("Enter 3 integers representing the length of the "
                + "edges of a triangle where every pair of two edges is "
                + "greater than the remaining edge. ");
        System.out.print("Edge 1: ");
        edge1 = in.nextInt();
        System.out.print("Edge 2: ");
        edge2 = in.nextInt();
        System.out.print("Edge 3: ");
        edge3 = in.nextInt();
        
        // Validate the inputs and display output if invalid.
        isValid = false;
        if (edge1 + edge2 > edge3){
            if (edge1 + edge3 > edge2){
                if (edge2 + edge3 > edge1){
                    isValid = true;
                }
                else {
                    System.out.println("The sum of " + edge2 + " and " + edge3 
                            + " is not greater than " + edge1 + ".");
                }
            }
            else {
                System.out.println("The sum of " + edge1 + " and " + edge3 
                        + " is not greater than " + edge2 + ".");
            }
        }
        else {
            System.out.println("The sum of " + edge1 + " and " + edge2 + " is "
                    + "not greater than " + edge3 + ".");
        }
        
        // If valid, calculate the perimiter. If invalid, display error.
        if (isValid) {
            perimeter = edge1 + edge2 + edge3;
            System.out.println("The perimeter is " + perimeter + ".");
        }
        else {
            System.out.println("The edge values entered are not valid.");
        }  
    }
}
