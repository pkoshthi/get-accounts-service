package lambdaexpressions.primitivesupplier;

import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;

class Employee
{
	int empno;
	String name;
	double salary;
	
	public Employee(int empno,String name,double salary)
	{
		this.empno = empno;
		this.name = name;
		this.salary = salary;
	}
}

public class TestPrimitiveSupplier {

	public static void main(String[] args) {
		
		IntSupplier is=()-> {
			Employee e=new Employee(100,"Pradeep",10000);
			return e.empno;
		};
		System.out.println("Employee No : "+is.getAsInt());
		
		DoubleSupplier ds=()-> {
			Employee e=new Employee(100,"Pradeep",10000);
			return e.salary;
		};
		System.out.println("Employee Salary : "+ds.getAsDouble());
		
	}

}
