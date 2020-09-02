import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;
import java.io.*;

/**
 *
 * @author  Aronson
 */
public class TestMain
{

    public static void main(String args[]) {
        TestMain test = new TestMain();
        test.testStairs();
    }

    @Test
    public void testStairs() {
        Map.getInstance().loadMap("maps/stairs.jev");
       Main.runJerooCode();

       assertTrue("(4, 1)", !Map.getInstance().isFlower(4,1));
       assertTrue("(3, 2)", !Map.getInstance().isFlower(3,2));
       assertTrue("(2, 3)", !Map.getInstance().isFlower(2,3));
       assertTrue("(1, 4)", !Map.getInstance().isFlower(1,4));
      
       assertTrue("Jeroo at (1, 4)", Map.getInstance().isJeroo(1, 4));
    }


}
