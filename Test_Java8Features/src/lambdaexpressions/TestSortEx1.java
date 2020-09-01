package lambdaexpressions;

import java.util.ArrayList;
import java.util.Collections;

class Employee
{
	String name;
	int eno;
	
	public Employee(String name,int eno)
	{
		this.name= name;
		this.eno = eno;
	}
	
	public String toString()
	{
		return eno+" : "+name;
	}
}

public class TestSortEx1 {

	public static void main(String[] args) {
		ArrayList<Employee> eList=new ArrayList<Employee>();
		
		eList.add(new Employee("Durga",54321));
		eList.add(new Employee("Sunny",43210));
		eList.add(new Employee("Bunny",45321));
		eList.add(new Employee("Chinny",98765));
		eList.add(new Employee("Vinny",87654));
		
		System.out.println("Before Sort :\n"+eList);
		
		//Sorting custom objects by using Comparator compare() method in lambda expression
		Collections.sort(eList,(e1,e2)->e1.eno<e2.eno?-1:e1.eno>e2.eno?1:0);
		
		System.out.println("\nSort by Eno :\n"+eList);
		
		//Sorting custom objects by using Comparable compareTo() method in lambda expression
		Collections.sort(eList, (e1,e2)->e1.name.compareTo(e2.name));
		
		System.out.println("\nSort by Emp name :\n"+eList);
		
	}

}
