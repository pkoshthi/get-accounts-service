package lambdaexpressions.primitivepredicate;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

/*
 Primitive Predicate types
 --------------------------
 IntPredicate
 DoublePredicate
 LongPredicate
 */


public class TestIntPredicateEx1 {

	public static void main(String[] args) {
		Integer[] intArr = {0,5,10,15,20,21,25};
		
		//Find even using Predicate
		System.out.println("Find even using Predicate");
		Predicate<Integer> p=i->i%2==0;
		for(int i:intArr)
		{
			if(p.test(i))
			{
				System.out.println(i);
			}
		}
		
		//Find Even using IntPredicate
		System.out.println("\nFind Even using IntPredicate");
		IntPredicate intPredicate=i->i%2==0;
		for(int i:intArr)
		{
			if(intPredicate.test(i))
			{
				System.out.println(i);
			}
		}

	}

}
