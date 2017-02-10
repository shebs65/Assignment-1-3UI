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
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
         //creating city
      City kitchener = new City();
      
      //creating robot
      Robot karel = new Robot (kitchener, 3, 0, Direction.EAST);
              
      //creating flag
      Thing flag = new Thing (kitchener, 3, 1, Direction.WEST);
        
      //creating walls (mountain)
      new Wall (kitchener, 3, 2, Direction.WEST);
      new Wall (kitchener, 3, 2, Direction.NORTH);
      new Wall (kitchener, 2, 3, Direction.WEST);  
      new Wall (kitchener, 1, 3, Direction.WEST);  
      new Wall (kitchener, 1, 3, Direction.NORTH);  
      new Wall (kitchener, 1, 3, Direction.EAST);  
      new Wall (kitchener, 2, 4, Direction.NORTH);
      new Wall (kitchener, 2, 4, Direction.EAST);
      new Wall (kitchener, 3, 4, Direction.EAST);
      
      //moving karel
      karel.move();
      
      //picking up flag
      karel.pickThing();
      
      
      //moving karel up mountain
      karel.turnLeft();
      
      karel.move();
      
      karel.turnLeft();
      karel.turnLeft();
      karel.turnLeft();
    
      karel.move();
    
      karel.turnLeft();
    
      karel.move();
      karel.move();
    
      karel.turnLeft();
      karel.turnLeft();
      karel.turnLeft();
    
      karel.move();
    
      //placing flag on top of mountain
      karel.putThing();
    
      //moving karel down mountain
      karel.move();
    
      karel.turnLeft();
      karel.turnLeft();
      karel.turnLeft();
    
      karel.move();
    
      karel.turnLeft();
     
      karel.move();
     
      karel.turnLeft();
      karel.turnLeft();
      karel.turnLeft();
    
      karel.move();
      karel.move();
      
      karel.turnLeft();
      
    }
}
