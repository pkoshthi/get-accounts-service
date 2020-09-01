package lambdaexpressions;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class TestConsumerEx2 {

	public static void main(String[] args) {
		
		Function<Student,String> f=student->{
			int marks=student.marks;
			String grade="";
			if(marks>=80 && marks<100) grade="A[Dictinction]";
			else if(marks>60)  grade="B[First Class]";
			else if(marks>50) grade="C[Second Class]";
			else if(marks>35) grade="D[Third Class]";
			else grade="E[Failed]";
			return grade;
		};
		
		Predicate<Student> p=student->student.marks>=60;
		
		Consumer<Student> c=student->{
			System.out.println(student+" : "+f.apply(student));
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
			c.accept(student);
		}
		
		System.out.println("\nStudent details whose marks is greater than 60\nName : Marks : Grade\n");
		for(Student student:students)
		{
			if(p.test(student))
			{ c.accept(student);
			}
		}
		
	}

}
