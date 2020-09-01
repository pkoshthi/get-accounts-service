package lambdaexpressions.primitiveconsumer;

import java.util.function.BiConsumer;
import java.util.function.ObjDoubleConsumer;


class Employee
{
	String name;
	double salary;
	
	public Employee(String name,double salary)
	{
		this.name = name;
		this.salary = salary;
	}
	
	public String toString()
	{
		return name+" : "+salary;
	}
}

public class TestObjDoubleConsumer {

	public static void main(String[] args) {
		
		// Increment salary of an employee by 500 using BiConsumer
		Employee e=new Employee("Pradeep",1000);
		System.out.println("Before Increment\n"+e);
		BiConsumer<Employee,Double> c=(emp,increment)->emp.salary+=increment;
		c.accept(e,500.00);
		System.out.println("After Increment using BiConsumer\n"+e);
		
		
		System.out.println();
		
		// Increment salary of an employee by 1000 using ObjDoubleConsumer
		Employee e1=new Employee("Sandeep",2000);
		System.out.println("Before Increment\n"+e1);
		ObjDoubleConsumer<Employee> odConsumer=(emp,increment)->emp.salary+=increment;
		odConsumer.accept(e1, 1000.00);
		System.out.println("After Increment using ObjDoubleConsumer\n"+e1);
		

	}

}
