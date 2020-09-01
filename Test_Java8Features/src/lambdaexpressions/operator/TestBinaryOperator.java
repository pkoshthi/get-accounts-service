package lambdaexpressions.operator;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

public class TestBinaryOperator {

	public static void main(String[] args) {
		
		// Accept two input strings and return concatenated string using BiFunction
        BiFunction<String,String,String> bf=(s1,s2)->s1+s2;
        System.out.println("Accept two input strings and return concatenated string using BiFunction");
        System.out.println(bf.apply("India", "Karnataka"));
        
        // Accept two input strings and return concatenated string using BinaryOperator
        BinaryOperator<String> bof=(s1,s2)->s1+s2;
        System.out.println("\nAccept two input strings and return concatenated string using BinaryOperator");
        System.out.println(bof.apply("Karnataka","Vijaypur"));
        
        //Sum of two input integers using IntBinaryOperator
        IntBinaryOperator ibof=(i1,i2)->i1+i2;
        System.out.println("\nSum of two input integers using IntBinaryOperator");
        System.out.println("Sum of (2,4) : "+ibof.applyAsInt(2,4));
        
        
	}

}
