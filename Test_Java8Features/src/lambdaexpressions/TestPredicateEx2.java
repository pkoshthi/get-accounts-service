package lambdaexpressions;

import java.util.function.Predicate;


// Program to display the strings whose length is more than 5
public class TestPredicateEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArray = {"Nag","Yash","Puneeth","Darshan","Shiv","Druva","Sudeep"};
		Predicate<String> p = s->s.length()>5;
		
		for(String s:strArray)
		{
			if(p.test(s))
			{
				System.out.println(s);
			}
		}

	}

}
