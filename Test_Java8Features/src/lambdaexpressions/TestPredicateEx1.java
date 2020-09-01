package lambdaexpressions;

import java.util.function.Predicate;

/*
 *Predicate is a predefined functional interface
 interface Predicate<T>
 {
 	public boolean test(T t);
 }
 */


// Program to check whether given number is even or odd
public class TestPredicateEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Predicate<Integer> p = i->i%2==0;
		System.out.println(p.test(6));
		System.out.println(p.test(9));
		
	}

}


/*

public boolean test(Integer i)
{
	 if(i%2 == 0)
		 {
		   return true;
		 }
	 else
		 {
		  return false;
		 }
}

The above test method can be replaced by lambda expression as below
(Integer I)->I%2==0;   Again if only one argument we can consize as below
I->I%2==0;


 */
