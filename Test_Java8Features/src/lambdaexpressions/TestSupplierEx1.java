package lambdaexpressions;

import java.util.Date;
import java.util.function.Supplier;

/*
  Just supply my required objects and it wont take any input --> Supplier
  
  interface Supplier<R>
  {
   	public R get();
  }
 */



public class TestSupplierEx1 {

	public static void main(String[] args) {
		
		Supplier<Date> s=()->new Date();
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		
	}

}
