package lambdaexpressions.primitivefunction;

import java.util.function.Function;
import java.util.function.IntFunction;

public class TestIntFunctionEx1 {

	public static void main(String[] args) {
		
		// Square a number using Function
		Function<Integer,Integer> f=i->i*i;
		System.out.println("Square a number using Function");
		System.out.println("Square of 5 : "+f.apply(5));
		
		// Square a number using IntFunction
		IntFunction<Integer> intFunction=i->i*i;
		System.out.println("\nSquare a number using IntFunction");
		System.out.println("Square of 6 : "+intFunction.apply(6));

	}

}
