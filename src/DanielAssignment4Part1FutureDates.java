
/**
 * Prompts the user to enter an integer from the console for today’s day of the
 * week (Sunday is 0, Monday is 1, …, and Saturday is 6), then prompts the user
 * to enter the number of days after today for a future day.
 * Displays the future day of the week.
 *
 * @author Daniel de Sao Jose (991500928)
 */

import java.util.Scanner;

public class DanielAssignment4Part1FutureDates {

    public static void main(String[] args) {
        
        // Utility obejects
        Scanner in = new Scanner(System.in);
        
        // Input variables
        int dayOfTheWeek; // Today's day of the week.
        int numberOfDaysAfterToday; // The number of days after today.

        // Output variables
        int futureDayOfTheWeek; // The future day of the week.
        String dayOfTheWeekString = new String();
        String futureDayOfTheWeekString = new String();

        // Prompt users for input.
        System.out.println("Assert the following: 0=Sunday, 1=Monday, "
                + "2=Tuesday, 3=Wednesday, 4=Thursday, 5=Friday, 6=Saturday");
        System.out.print("Enter today's day: ");
        dayOfTheWeek = in.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        numberOfDaysAfterToday = in.nextInt();
        
        // Calculate future day of the week using modulus.
        futureDayOfTheWeek = (dayOfTheWeek + numberOfDaysAfterToday) % 7;
        
        // Figure out the days of the week string for dayOfTheWeek.
        switch (dayOfTheWeek) {
            case 0: dayOfTheWeekString = "Sunday";
            break;
            case 1: dayOfTheWeekString = "Monday";
            break;
            case 2: dayOfTheWeekString = "Tuesday";
            break;
            case 3: dayOfTheWeekString = "Wednesday";
            break;
            case 4: dayOfTheWeekString = "Thursday";
            break;
            case 5: dayOfTheWeekString = "Friday";
            break;
            case 6: dayOfTheWeekString = "Saturday";
            break;
        }
        
        // Figure out the days of the week string for futureDayOfTheWeek.
        switch (futureDayOfTheWeek) {
            case 0: futureDayOfTheWeekString = "Sunday";
            break;
            case 1: futureDayOfTheWeekString = "Monday";
            break;
            case 2: futureDayOfTheWeekString = "Tuesday";
            break;
            case 3: futureDayOfTheWeekString = "Wednesday";
            break;
            case 4: futureDayOfTheWeekString = "Thursday";
            break;
            case 5: futureDayOfTheWeekString = "Friday";
            break;
            case 6: futureDayOfTheWeekString = "Saturday";
            break;
        }
        
        
        // Display desired output.
        System.out.println("Today is " + dayOfTheWeekString + 
                " and the future day is " + futureDayOfTheWeekString + ".");

    }

}
