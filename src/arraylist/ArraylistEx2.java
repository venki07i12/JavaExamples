package arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistEx2 {

	public static void main(String[] args) {
		
		Employee e1= new Employee("venkat", 32, "QA");
		Employee e2= new Employee("venkatesh", 30, "QA");
		Employee e3= new Employee("Rushiketh", 18, "QA");
		
		ArrayList<Employee> al = new ArrayList<Employee>();
			al.add(e1);
			al.add(e2);
			al.add(e3);
			Iterator<Employee> itr = al.iterator();
			while(itr.hasNext())
			{
			Employee emp=itr.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		
			}
	}

}
