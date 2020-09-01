package lambdaexpressions.optional;

import java.util.Optional;

public class OptionalEx2 {

	public static void main(String[] args) {
		
		String[] str=new String[10];
		str[5] = "JAVA OPTIONAL CLASS EXAMPLE";
		
		Optional<String> optionalStr = Optional.ofNullable(str[5]);
		System.out.println(optionalStr); // Optional[JAVA OPTIONAL CLASS EXAMPLE]
		
		if(optionalStr.isPresent())
		{
			String lowercasestring=str[5].toLowerCase();
			System.out.println(lowercasestring);
		}
		else
		{
			System.out.println("String value is not present");
		}

	}

}
