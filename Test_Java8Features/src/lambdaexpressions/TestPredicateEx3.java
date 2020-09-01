package lambdaexpressions;

import java.util.function.Predicate;


// Program to display the strings,which are having even number of characters
public class TestPredicateEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] strArray = {"Nag","Yash","Puneeth","Darshan","Shiv","Druva","Sudeep"};
		Predicate<String> p = s->s.length()%2==0;
		
		for(String s:strArray)
		{
			if(p.test(s))
			{
				System.out.println(s);
			}
		}
	}

}
