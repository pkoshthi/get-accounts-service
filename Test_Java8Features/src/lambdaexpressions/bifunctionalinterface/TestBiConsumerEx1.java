package lambdaexpressions.bifunctionalinterface;

import java.util.ArrayList;
import java.util.function.BiConsumer;

class Employee3
{
	String name;
	double salary;
	
	public Employee3(String name,double salary)
	{
		this.name = name;
		this.salary = salary;
	}
	
	public String toString()
	{
		return name+" : "+salary;
	}
}

// Demo BiConsumer - Program to increment salary of each employee by 500
public class TestBiConsumerEx1 {

	public static void main(String[] args) {
		ArrayList<Employee3> l=new ArrayList<Employee3>();
		populate(l);
		BiConsumer<Employee3,Double> bc=(emp,increment)->emp.salary+=increment;
        for(Employee3 e:l)
        {
        	System.out.println("Before increment --> "+e);
        	bc.accept(e, 500.00);
        	System.out.println("After increment --> "+e);
        	System.out.println();
        }
	}
	
	public static void populate(ArrayList<Employee3> l)
	{
		l.add(new Employee3("Pradeep",1000));
		l.add(new Employee3("Sandeep",1500));
		l.add(new Employee3("Kiran",2000));
		l.add(new Employee3("Sanjay",2500));
	}

}
