package lambdaexpressions.primitivefunction;

import java.util.function.Function;
import java.util.function.ToIntFunction;

public class TestToIntFunction {

	public static void main(String[] args) {
		
		//Find length of string using Function
		Function<String,Integer> f=s->s.length();
		System.out.println("Find length of string using Function");
		System.out.println("Lenght of string India : "+f.apply("India"));
		
		//Find length of string using ToIntFunction
		ToIntFunction<String> toIntFunction=s->s.length();
		System.out.println("\nFind length of string using ToIntFunction");
		System.out.println("Length of string Karnataka : "+toIntFunction.applyAsInt("Karnataka"));

	}

}
