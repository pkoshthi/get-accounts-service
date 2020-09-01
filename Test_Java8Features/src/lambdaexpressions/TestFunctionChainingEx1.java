package lambdaexpressions;

import java.util.function.Function;

public class TestFunctionChainingEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Function<Integer,Integer> f1=i->2*i;
		Function<Integer,Integer> f2=i->i*i;
		System.out.println(f1.andThen(f2).apply(10)); // output --> 400
		
		System.out.println(f1.compose(f2).apply(10)); // output --> 200
	}

}
