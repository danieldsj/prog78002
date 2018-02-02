/**
 * This program must import Scanner, take input from the user, and display it
 * on the console.
 *
 * @author Daniel de Sao Jose (991500928)
 */

// Import scanner
import java.util.Scanner;

public class DanielScanner {

    public static void main(String[] args) {

        // Create input variable.
        String input;

        // Create instance of the Scanner class.
        Scanner myScanner = new Scanner(System.in);

        // Print instructions.
        System.out.print("Please enter some text: ");

        // Read the input.
        input = myScanner.nextLine();

        // Display output.
        System.out.println("You entered the following text \"" + input + "\".");

    }

}
