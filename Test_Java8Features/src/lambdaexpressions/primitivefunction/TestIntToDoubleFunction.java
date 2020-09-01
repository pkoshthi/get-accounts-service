package lambdaexpressions.primitivefunction;

import java.util.function.Function;
import java.util.function.IntToDoubleFunction;

public class TestIntToDoubleFunction {

	public static void main(String[] args) {
		
		// Find the square root of an integer using Function
		Function<Integer,Double> f=i->Math.sqrt(i);
		System.out.println("Find the square root of an integer using Function");
		System.out.println("Squre root of 24 : "+f.apply(24));
		
		// Find the square root of an integer using IntToDoubleFunction
		IntToDoubleFunction intToDoubleFunction=i->Math.sqrt(i);
		System.out.println("\nFind the square root of an integer using IntToDoubleFunction");
		System.out.println("Square root of 35 : "+intToDoubleFunction.applyAsDouble(35));

	}

}
