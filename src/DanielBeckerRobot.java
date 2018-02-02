
/**
 * Imports the "Becker Robots" library and use it to create instances of the 
 * City and Robot classes.
 * @author Daniel
 */
// Import external library.
import becker.robots.*;

public class DanielBeckerRobot {

    public static void main(String[] args) {

        // Create an instance of a City class.
        City oakville = new City(10, 10);

        // Create an instance of a Robot class.
        Robot bebop = new Robot(oakville, 0, 0, Direction.EAST);
        
    }

}
