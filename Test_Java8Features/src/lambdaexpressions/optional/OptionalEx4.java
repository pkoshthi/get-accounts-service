package lambdaexpressions.optional;

import java.util.Optional;

public class OptionalEx4 {

	public static void main(String[] args) {
		
		String[] str=new String[10];
		str[5] = "JAVA OPTIONAL CLASS EXAMPLE";
		
		Optional<String> empty=Optional.empty(); // It returns an empty instance of Optional class
		System.out.println(empty);
		
		Optional<String> optionalStr = Optional.of(str[5]); // It returns non empty optional
		
		// If value is present, it returns an optional otherwise an empty optional
		System.out.println("Filtered value : "+optionalStr.filter(s->s.equals("Abc")));
		System.out.println("Filtered value : "+optionalStr.filter(s->s.equals("JAVA OPTIONAL CLASS EXAMPLE")));
		
		// It returns value of an Optional, If value not present, it throws an NoSuchElementException
		System.out.println("Getting value : "+optionalStr.get());
		
		// It returns hash code of the value
		System.out.println("Getting hashcode : "+optionalStr.hashCode());

		// It returns true if value is present, otherwise false
		System.out.println("Is value present : "+optionalStr.isPresent());
		
		// It returns non-empty optional if value is present, otherwise returns an empty optional
		System.out.println("Nullable optional : "+Optional.ofNullable(str[5]));
		
		// It returns value if available, otherwise returns specified value
		System.out.println("OrElse : "+optionalStr.orElse("Value is not present"));
		System.out.println("OrElse : "+empty.orElse("Value is not present" ));
		
		
		// Printing the value by using method reference
		optionalStr.ifPresent(System.out::println);
	}

}
