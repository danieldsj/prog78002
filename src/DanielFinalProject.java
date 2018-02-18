/*
 * Project
 * 
 * Requirements:
 * - Create a city.
 * - Create a house in the city.
 * - Add a newspaper outside the house.
 * - Add a robot inside the "bed" of the house.
 * - Write instructions that does the following:
 *   - Move the robot to the newspaper.
 *   - Pick up the newspaper.
 *   - Move the robot inside the "bed" of the house.
 *   - Drop the newspaper.
 * 
 * @author Daniel de Sao Jose (991500928)
 */

import becker.robots.*;
        
public class DanielFinalProject {
    
    public static void main(String[] args) {
        
        // Create a city called Astoria (location of Short Circuit movie).
        City astoria = new City(5, 5);
        
        // Create a house by creating walls.
        Wall wall1 = new Wall(astoria, 1, 1, Direction.NORTH); // North wall
        Wall wall2 = new Wall(astoria, 1, 2, Direction.NORTH);
        Wall wall3 = new Wall(astoria, 1, 1, Direction.WEST); // West wall
        Wall wall4 = new Wall(astoria, 2, 1, Direction.WEST);
        Wall wall5 = new Wall(astoria, 2, 1, Direction.SOUTH); // South wall
        Wall wall6 = new Wall(astoria, 2, 2, Direction.SOUTH);
        Wall wall7 = new Wall(astoria, 1, 2, Direction.EAST); //East wall
        Wall wall8 = new Wall(astoria, 1, 2, Direction.SOUTH); // Interior wall
        
        // Add the newspaper outside the house.
        Thing newspaper = new Thing(astoria, 2, 3);
        
        // Declare the coordinates for the robot's "bed".
        int bedStreet = 1;
        int bedAvenue = 2;
        
        // Add the robot inside the house (Johnny Five is the name of the robot in the Short Circuit movie).
        Robot johnnyFive = new Robot(astoria, bedStreet, bedAvenue, 
                Direction.EAST);
    
        // Try to move until you can pick something up.
        while(!(johnnyFive.canPickThing())){
            if(johnnyFive.frontIsClear()){
                johnnyFive.move();
            }
            else{
                johnnyFive.turnLeft();
            }
        }
        
        // Pick the thing up.
        johnnyFive.pickThing();
        
        // Turn around.
        for (int i = 0; i < 2; i++) johnnyFive.turnLeft();
        
        // Try to move until you are at the "bed" coordinates.
        while(!(johnnyFive.getAvenue() == bedAvenue && 
                johnnyFive.getStreet() == bedStreet)){
            if(johnnyFive.frontIsClear()){
                johnnyFive.move();
            }
            else{
                for(int i = 0; i < 3; i++) {
                    johnnyFive.turnLeft();
                }
            }
        }
        
        // Drop the thing off in the bed coordinates.
        johnnyFive.putThing();
    }
               
}
