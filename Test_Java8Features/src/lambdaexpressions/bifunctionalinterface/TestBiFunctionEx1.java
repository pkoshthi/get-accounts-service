package lambdaexpressions.bifunctionalinterface;

import java.util.ArrayList;
import java.util.function.BiFunction;



/*
 
    interface BiFunction<T,U,R>
    {
    	public R apply(T t,U u);
    }
 */


class Employee2
{
	Integer eno;
	String name;
	
	public Employee2(Integer eno,String name)
	{
		this.eno = eno;
		this.name = name;
	}
	
	public String toString()
	{
		return eno+" : "+name;
	}
}


public class TestBiFunctionEx1 {

	public static void main(String[] args) {
		
		BiFunction<Integer,String,Employee2> bf=(eno,name)->new Employee2(eno,name);
		
		ArrayList<Employee2> l=new ArrayList<Employee2>();
		l.add(bf.apply(100,"Sandeep"));
		l.add(bf.apply(101,"Pradeep"));
		l.add(bf.apply(102,"Ramesh"));
		l.add(bf.apply(103,"Shiva"));
		l.add(bf.apply(104,"Kiran"));
		
		for(Employee2 e:l)
		{
			System.out.println(e);
		}
		
	}

}
