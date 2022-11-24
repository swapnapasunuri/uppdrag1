package Test_pkg;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Jacket {

	    private Set<String> colors = new HashSet<>();

	    //****************ADD
	    public void add(String color) {

	        colors.add(color);
	    }

	    
	    //*****************Make LIST
	    public List<String> toList() {

	        return new ArrayList<>(colors);
	    }

	    
	    //*****************check Hash
	    public boolean equal_hash() { 

		    ArrayList<String> new_color_list =  new ArrayList<>(colors);
		    		    
		    
		    return (new_color_list.hashCode()==colors.hashCode()) ? true : false;

	    	
	    }
	    
	    
	    
	    

}
	

