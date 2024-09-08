package learn;

import java.util.*;
import java.util.function.BiConsumer;

public class MapExample {

	public static void main(String[] args) {
		//HashMap
		HashMap<String, Integer> courses =new HashMap<>();
		//adding elements
		courses.put("Core Java", 4000);
		courses.put("J2EE", 8000);
		courses.put("Android", 4000);
		courses.put("Python", 3500);
		courses.put("J2EE", 10000);
		
		System.out.println(courses);
		
		//traverse
		courses.forEach((key,value)->{
			System.out.println(key+"="+value);
		});
		
		System.out.println("___________________________________________________");
		//TreeMap
		
		TreeMap<String,Integer> treemap=new TreeMap<>();
		treemap.putAll(courses);
		System.out.println("TreeMap"+treemap);
		treemap.forEach((key,value)->{
			System.out.println(key+"="+value);
		});
	
	}

}
