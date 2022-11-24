package Test_pkg;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class JacketTest {

	
	private Jacket jackets;

    @BeforeEach
    void setupEach() {

        jackets = new Jacket();
        jackets.add("red");
        jackets.add("green");
        jackets.add("yellow");
        jackets.add("blue");
        jackets.add("magenta");
        jackets.add("brown");
    }

    @Test
    @DisplayName("added color already exists jackets collection")
    void add() {

        var newColor = "pink";
        jackets.add(newColor);

        assertTrue(jackets.contains(newColor),
                "failure - added colour not it the collection");
    }

    

    @Test
    @DisplayName("My jackets list should match list of jacketss")
    void toList() {

        var myList = Arrays.asList("red","green", "yellow",
                "blue", "magenta", "brown");
        var colorList = jackets.toList();

        Collections.sort(myList);
        Collections.sort(colorList);

        assertEquals(colorList, myList,
                "failure - my new jackets list didn't match");
    }
        
    
    @Test
    @DisplayName("Hash equal?")
    void check_hashes()
    {
        	
    	assertEquals(true, jackets.equal_hash(),
                "failure - hash did not match");
    }
  
    
	
}
