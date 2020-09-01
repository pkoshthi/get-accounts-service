package lambdaexpressions.operator;

import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class TestUnaryOperator {

	public static void main(String[] args) {
		
		// Square an input integer using UnaryOperator Function
		UnaryOperator<Integer> uof=i->i*i;
		System.out.println("Square an input integer using UnaryOperator Function");
		System.out.println("Square of 6 : "+uof.apply(6));
		
		// Square an input integer using IntUnaryOperator Function
		IntUnaryOperator iuof=i->i*i;
		System.out.println("\nSquare an input integer using IntUnaryOperator Function");
		System.out.println("Square of 9 : "+iuof.applyAsInt(9));

		// Increment an input integer using IntUnaryOperator Function
		IntUnaryOperator iuof1=i->i+1;
		System.out.println("\nIncrement of 5 by 1 : "+iuof1.applyAsInt(5));
		
		System.out.println("\n\nIntUnaryOperator chaining");
		System.out.println(iuof.andThen(iuof1).applyAsInt(4));
	}

}
