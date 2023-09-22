package collectionsDemo;

import java.util.HashSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class HashSetDemo {

	private static final HashSet<String> Cities = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		HashSet<String> cities = new HashSet<>();
		
		cities.add("London");
		cities.add("Paris");
		cities.add("New York");
		cities.add("New Delhi");
		cities.add("Moscow");
		cities.add("Mumbai");
		
		for (String t: cities)
		{
			System.out.println(t);
		}
		
		System.out.println(Cities.size());
		
		
		System.out.println(Cities.contains("Hyderabad"));
		

		Iterator itr = (Iterator) cities.iterator();
		
		while(((java.util.Iterator<String>) itr).hasNext())
		{
			System.out.println();
		}
		
	}
	
}
