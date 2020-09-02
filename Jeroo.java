/**
 * Put your Jeroo methods in this class.
 * @author Steve Aronson
 */
public class Jeroo extends JerooBase {

    /**
    * This method should have the Jeroo pickup all the flowers on the staircase.
    * IMPORTANT:  It needs to call helper method(s).
    */
    public void climbStairs() {
        step();
        step();
        step();
        step();
    }
    
    // Put any helpermethods here.  Be sure to comment the helper methods using /** */

    /*this completes one step, turning, going up, turning and picking*/
    public void step(){
      turn(LEFT);
      hop();
      turn(RIGHT);
      hop();
      pick();
    }
    
    
    
    // Do NOT touch the code below here

    public Jeroo() {super();}

    public Jeroo(int flowers) {super(flowers); }

    public Jeroo(int y, int x) { super(y, x); }

    public Jeroo(int y, int x, CompassDirection direction) { super (y, x, direction);}

    public Jeroo(int y, int x, int flowers) { super (y, x, flowers);}

    public Jeroo(int y, int x, CompassDirection direction, int flowers) { super(y, x, direction, flowers);}

}
