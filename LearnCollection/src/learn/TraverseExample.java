package learn;

import java.util.*;


public class TraverseExample {
	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<>();
		names.add("xyz");
		names.add("abc");
		names.add("pqr");
		names.add("abc");
		names.add("rst");
		names.add("rst");
		
		//traverse using for each loop
		System.out.println("Traverse using FOR EACH LOOP : ");
		for(String str:names) {
//			System.out.print(str + "\t" + str.length()+"\t");	
//			StringBuffer br= new StringBuffer(str);
//			System.out.println(br.reverse());
			System.out.println(str);
		}
		
		System.out.println("********************************");
		
		//traverse using Iterator
		System.out.println("Traverse using ITERATOR :");
		Iterator<String> itr=names.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("********************************");
		
		//Backward traverse using ListIterator 
		System.out.println("Backward traverse using LISTITERATOR ");
		ListIterator<String> litr = names.listIterator(names.size()); 
		while(litr.hasPrevious()) {
			String str = litr.previous();
			System.out.println(str);
			
		}
		
		System.out.println("********************************");
		
		//Traverse using foreach()
		System.out.println("Traverse using FOREACH() : ");
		names.forEach(e->{
			System.out.println(e);
		});
		
		System.out.println("********************************");
		
		//Traverse using ENUMERATION
		System.out.println("Traverse using ENUMERATION : ");
		Vector<String> vector=new Vector<>();
		vector.addAll(names);
		Enumeration enumeration = Collections.enumeration(vector);
		while(enumeration.hasMoreElements()) {
			Object str = enumeration.nextElement();
			System.out.println(str);
		}
		
		System.out.println("********************************");
		
		//Traverse of TREESET
		System.out.println("Traverse of TREESET : ");
		TreeSet<String> treeset=new TreeSet<>();
		treeset.addAll(names);
		treeset.forEach(t->{
			System.out.println(t);
		});
		
	}
}
