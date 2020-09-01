package lambdaexpressions;

import java.util.function.Predicate;

// Program to display the numbers which are even and/or greater than 10
public class TestPredicateJoiningEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] intArr = {12,10,8,30,4,42,21,1,5,9};
		
		Predicate<Integer> p1 = i->i%2==0;
		Predicate<Integer> p2 = i->i>10;
		
		System.out.println("The numbers which are even and greater than 10 are ");
		
		for(Integer i:intArr)
		{
			if(p1.and(p2).test(i))
			{
				System.out.println(i);
			}
		}	
		
       System.out.println("\nThe numbers which are even OR greater than 10 are ");
		
		for(Integer i:intArr)
		{
			if(p1.or(p2).test(i))
			{
				System.out.println(i);
			}
		}
		
		System.out.println("\nThe numbers which are NOT even");
		for(Integer i:intArr)
		{
			if(p1.negate().test(i))
			{
				System.out.println(i);
			}
		}
		
	}

}
