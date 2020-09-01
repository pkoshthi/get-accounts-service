package lambdaexpressions.optional;

import java.util.Optional;

public class OptionalEx3 {

	public static void main(String[] args) {
		
		String[] str=new String[10];
		str[5] = "JAVA OPTIONAL CLASS EXAMPLE";
		
		Optional<String> optionalStr = Optional.ofNullable(str[5]);
		
		optionalStr.ifPresent(System.out::println); // printing the value by using method reference
		
		System.out.println(optionalStr.get()); // printing value by using get method
		
		System.out.println(str[5].toLowerCase());
		

	}

}
