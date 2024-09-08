package comparable;

import java.util.ArrayList;
import java.util.Collections;

public class SortExample {

	public static void main(String[] args) {
		ArrayList<Emp> emps=new ArrayList<>();
		emps.add(new Emp("Ruta","7896541236",33));
		emps.add(new Emp("Radha","8523697412",11));
		emps.add(new Emp("Reva","9874563214",21));
		emps.add(new Emp("Kanchan","4569871236",10));
		emps.add(new Emp("Sam","9999999999",55));
		
		System.out.println(emps);
		
		Collections.sort(emps);
		System.out.println(emps);

	}

}
