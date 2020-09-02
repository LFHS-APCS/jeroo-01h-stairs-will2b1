/**
 * Pickup all the flowers as described in the Readme.md
 * Use left and right arrow keys to see it when running main()
 */
public class Main implements Directions {

    /**
     * Do NOT edit this.  Put your code inside the runJerooCode method below.
     */
    public static void main(String[] args) {
        Map.getInstance().loadMap("maps/stairs.jev");
        new JerooGUI();
        runJerooCode();
    }

    /**
     * Do NOT edit this.  It is already correct.
     */
    public static void runJerooCode() {
       // Write code here to make a letter here
       Jeroo kim = new Jeroo(5, 0, EAST, 0);
        kim.climbStairs();

    }

}
