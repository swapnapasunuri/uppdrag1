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

	    //***************REMOVE
	    public void remove(String color) {

	        colors.remove(color);
	    }

	    //*****************Make LIST
	    public List<String> toList() {

	        return new ArrayList<>(colors);
	    }

	    
	    //*****************Make LIST
	    public boolean equal_hash() { 

		    ArrayList<String> new_color_list =  new ArrayList<>(colors);
		    		    
		    
		    return (new_color_list.hashCode()==colors.hashCode()) ? true : false;

	    	
	    }
	    
	    //*****************Check if contains
	    public boolean contains(String color) {

	        return colors.contains(color);
	    }

	    //*****************Return size
	    public int size() {

	        return colors.size();
	    }
	    
	    //*****************Remove all elements
	    
	    public int empty_size() {

	        colors.removeAll(colors);
	        return colors.size();
	        
	    }

}
	

