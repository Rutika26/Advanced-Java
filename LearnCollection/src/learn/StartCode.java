package learn;

import java.util.*;

public class StartCode {

	public static void main(String[] args) {
		System.out.println("Welcome to core java");
		
		//1) Type safe = same type of elements(objects) are addedd to collection
				
		//2) Un-Type safe = different types of elements can be added to collection
	
		
		//type safe collection
		ArrayList<String> names=new ArrayList<>();
		names.add("Radha");
		names.add("Revti");
		names.add("Reva");
		names.add("Rashi");
		names.add("Rashi");
		
		System.out.println(names);
		System.out.println(names.get(3));
		System.out.println("clone object - "+names.clone());
		names.set(2, "xyz");
		System.out.println(names);
		names.remove(3);
		System.out.println(names);
		System.out.println(names.size());
		System.out.println(names.contains("Reva"));
		System.out.println(names.contains("Rashi"));
		System.out.println("ARRAY LIST : "+names);
		//Iterator<String> itr=new Iterator<>();
		
	
		//un-type safe collection
		LinkedList list=new LinkedList();
		list.add("Sachin");
		list.add(101);
		list.add(true);
		list.add(1.1);
		System.out.println("LINKEDLIST : "+list);
		
		
		Vector<String> vector=new Vector<>();
		vector.addAll(names);
		System.out.println("VECTOR : "+vector);
		
		System.out.println("__________________________________________________");
		
		HashSet<Double> hashset=new HashSet<>();
		hashset.add(8.1);
		hashset.add(2.0);
		hashset.add(3.1);
		hashset.add(4.8);
		hashset.add(2.2);
		
		System.out.println("HASHSET : "+hashset);
		
		TreeSet<Double> treeset=new TreeSet<>();
		treeset.addAll(hashset);
		System.out.println("Sorted using TREESET : "+treeset);
		
	}

}
