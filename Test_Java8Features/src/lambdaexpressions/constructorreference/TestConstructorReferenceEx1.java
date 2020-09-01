package lambdaexpressions.constructorreference;

class Employee
{
	int empno;
	String name;
	
	public Employee(int empno,String name)
	{
		this.empno = empno;
		this.name = name;
	}
	
	public String toString()
	{
		return empno+" : "+name;
	}
}

interface Interface
{
	public Employee getEmployee(int empno,String name);
}

public class TestConstructorReferenceEx1 {

	public static void main(String[] args) {
		
		Interface i=Employee::new;
		Employee e = i.getEmployee(100, "Pradeep");
		System.out.println(e);		
	}

}
