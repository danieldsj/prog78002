/**
 * Break apart an equation so that we use three variables and a print statement 
 * that outputs the values of each variable.
 * 
 * @author Daniel de Sao Jose (991500928)
 */
public class DanielComputeExpression {

    public static void main(String[] args) {

        // Original equation and println statement.
        System.out.println((10.5 + 2 * 3) / (45 - 3.5));

        // Create variables of the correct type.
        double numerator;
        double denominator;
        double quotient;

        // Variables are the same as the original equation in print statement.
        numerator = 10.5 + 2 * 3;
        denominator = 45 - 3.5;
        quotient = numerator / denominator; 

        // Second print statement.
        System.out.println(numerator + " / " + denominator + " = " + quotient);

    }

}
