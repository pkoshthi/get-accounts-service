package lambdaexpressions;

import java.util.function.Function;
import java.util.function.Predicate;

class Student
{
	String name;
	int marks;
	
	public Student(String name,int marks)
	{
		this.name = name;
		this.marks = marks;
	}
	
	public String toString()
	{
		return name+ " : "+marks;
	}
}


// Program to find grade for the input Student marks
// Program to display the student details whose marks is greater than 60
public class TestFunctionEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Function<Student,String> f = student-> {
			String grade="";
			Integer marks=student.marks;
			if(marks>=80 && marks<100)  grade="A[Dictinction]";
			else if(marks>=60) grade="B[First class]";
			else if(marks>=50) grade="C[Second class]";
			else if(marks>=35) grade="D[Third class]";
			else grade="E[Failed]";
			return grade;
		};
		
		Student[] students =
			{
				new Student("Ramesh",90),
				new Student("Akash",75),
				new Student("Sandesh",55),
				new Student("Raj",40),
				new Student("Rakesh",30)
			};
		
		System.out.println("Display of student details\nName : Marks : Grade\n");
		for(Student student:students)
		{
			System.out.println(student+" : "+f.apply(student));
		}
		
		// Logic to display the student details whose marks is greater than 60
		Predicate<Student> p=student -> student.marks>60;
		System.out.println("\nStudent details whose marks is greater than 60\nName : Marks : Grade\n");
		for(Student student:students)
		{
			if(p.test(student))
			{
				System.out.println(student+" : "+f.apply(student));
			}
		}
	}

}
