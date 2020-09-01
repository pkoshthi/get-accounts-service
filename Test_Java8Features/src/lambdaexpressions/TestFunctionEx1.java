package lambdaexpressions;

import java.util.function.Function;

/*
 Input --> Perform operation --> Output
 interface Function<T, R>
 {
  	public R apply(T t);
 }
 
 */


// Program to return square of an input number - using Function Functional interface
public class TestFunctionEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Function<Integer,Integer> f=i->i*i;
		System.out.println("Square of 10 : "+f.apply(10));
		System.out.println("Square of 12 : "+f.apply(12));
		
	}

}
