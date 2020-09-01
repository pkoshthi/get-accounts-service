package lambdaexpressions.optional;

import java.util.Optional;


/*
 Java introduced a new class Optional in jdk8. It is a public final class and used to deal with NullPointerException in Java application. 
 You must import java.util package to use this class. It provides methods which are used to check the presence of value for particular variable.
 */


public class OptionalEx1 {

	public static void main(String[] args) {
		
		//Below lines of code without using Optional -> Throws NullPointerException
		
		/*String[] str=new String[10];
		  String lowercasestring = str[5].toLowerCase();
		  System.out.println(lowercasestring);
		*/
		
		String[] str=new String[10];
		Optional<String> optionalStr=Optional.ofNullable(str[5]);
		System.out.println(optionalStr); // Optional.empty
		
		if(optionalStr.isPresent()) // Check for value is present or not
		{
			String lowecasestring = str[5].toLowerCase();
			System.out.println(lowecasestring);
		}
		else
		{
			System.out.println("String value is not present");
		}
		
	}

}
