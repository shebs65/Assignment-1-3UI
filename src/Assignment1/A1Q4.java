/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author shebm3906
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //creating city
        City kitchener = new City(); 
                
        //creating robots
        Robot karel = new Robot (kitchener, 0, 0, Direction.SOUTH); 
        Robot matt = new Robot (kitchener, 0, 1, Direction.SOUTH);
        
        //creating walls
        new Wall (kitchener, 0, 1, Direction.WEST);
        new Wall (kitchener, 1, 1, Direction.WEST);
        new Wall (kitchener, 1, 1, Direction.SOUTH);
        
        //moving robots
        matt.move();
        
        karel.move();
        
        matt.turnLeft();
        
        matt.move();
        
        matt.turnLeft();
        matt.turnLeft();
        matt.turnLeft();
        
        karel.move();
        
        matt.move();
        
        matt.turnLeft();
        matt.turnLeft();
        matt.turnLeft();
        
        karel.turnLeft();
        
        matt.move();
        
        karel.move();
    }
}
