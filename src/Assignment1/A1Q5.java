/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author shebm3906
 */
public class A1Q5 {
    private static String m;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //creating city
    City kitchener = new City();
    
    //creating walls
    new Wall (kitchener, 2, 3, Direction.WEST);
    new Wall (kitchener, 2, 3, Direction.NORTH);
    new Wall (kitchener, 2, 3, Direction.EAST);
    new Wall (kitchener, 3, 3, Direction.EAST);
    new Wall (kitchener, 3, 3, Direction.SOUTH);    
        
    //creating robots
    Robot maria = new Robot (kitchener, 0, 1, Direction.WEST);
    Robot karel = new Robot (kitchener, 3, 3, Direction.EAST);
            
    //labeling robots
    maria.setLabel("M");
    karel.setLabel ("K");
    
    //creating things (expensive items)
    new Thing (kitchener, 0, 0, Direction.NORTH);
    new Thing (kitchener, 1, 0, Direction.NORTH);
    new Thing (kitchener, 1, 1, Direction.NORTH);
    new Thing (kitchener, 1, 2, Direction.NORTH);
    new Thing (kitchener, 2, 2, Direction.NORTH);
    
    //moving robots and picking up expensive items
    karel.turnLeft();
    karel.turnLeft();
    
    maria.move();
    maria.pickThing();
    
    karel.move();
    
    karel.turnLeft();
    karel.turnLeft();
    karel.turnLeft();
    
    maria.turnLeft();
    
    karel.move();
    karel.pickThing();
    
    maria.move();
    maria.pickThing();
    maria.turnLeft();
    
    karel.move();
    karel.pickThing();
    karel.turnLeft();
    
    maria.move();
    maria.pickThing();
      }
}
