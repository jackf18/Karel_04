/**
*
* Description of the program goes here  // provide a brief description
*
* @author <Jack Flaherty>  // replace <...> with your name
* @version <3/11/14> // replace <...> with the date
*/

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab04 {
   
     public static void takeTheField(Athlete arg)
     {
         arg.move();
         arg.move();
         arg.move();
         arg.move();
         arg.turnRight();
         arg.move();
         arg.move();
     }
     public static void main(String[] args) {
     Display.openWorld("maps/arena.map");
     Display.setSize(10, 10);
     Display.setSpeed(8);
     Athlete jack = new Athlete();
     Athlete michael = new Athlete();
     Athlete tommy = new Athlete();
     Athlete mark = new Athlete();
     Athlete maia = new Athlete();
     Athlete kerry = new Athlete (2, 7, Display.EAST, 0); // you could also position all the players using this kind of constructor.
     takeTheField(jack);
     takeTheField(michael);
     takeTheField(tommy);
     takeTheField(mark);
     takeTheField(maia);
     takeTheField(kerry);
     jack.move();
     jack.move();
     jack.move();
     jack.turnRight();
     michael.move();
     michael.move();
     michael.move();
     michael.turnLeft();
     michael.move();
     michael.move();
     michael.turnAround();
     tommy.move();
     tommy.turnLeft();
     tommy.move();
     tommy.turnAround();
     maia.move();
     maia.move();
     maia.turnRight();
     kerry.move();
     kerry.move();
     kerry.move();
     kerry.move();
     kerry.turnRight();
     mark.move();
     mark.move();
     mark.move();
     mark.move();
     mark.move();
     mark.turnLeft();
     mark.move();
     mark.turnAround(); 
     }
}