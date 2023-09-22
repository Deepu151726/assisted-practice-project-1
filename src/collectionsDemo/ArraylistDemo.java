package collectionsDemo;

import java.util.ArrayList;


public class ArraylistDemo {
	
	public static void main(String[] args) 
	{
		
		ArrayList<String> cities = new ArrayList<>();
		
		cities.add("London");
		cities.add("Paris");
		cities.add(2, "New Delhi");
		cities.add("Mumbai");
		
		System.out.println(cities.size());
		
		for(String t:cities)
		{
		
			System.out.println(t);
		}
		}
		
		
				
				
	}


