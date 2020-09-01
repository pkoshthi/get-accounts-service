package lambdaexpressions;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee1
{
	String name;
	double salary;
	
	public Employee1(String name,double salary)
	{
		this.name = name;
		this.salary = salary;
	}
}

// Program to display the list of employees whose salary is greater than 3000
public class TestPredicateEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Employee1> list = new ArrayList<Employee1>();
		list.add(new Employee1("Nag",3000));
		list.add(new Employee1("Darshan",5000));
		list.add(new Employee1("Suresh",2000));
		list.add(new Employee1("Puneeth",8000));
		list.add(new Employee1("Shiv",4000));
		
		Predicate<Employee1> p = e->e.salary>3000;
		
		for(Employee1 e:list)
		{
			if(p.test(e))
			{
				System.out.println(e.name+" : "+e.salary);
			}
		}

	}

}
