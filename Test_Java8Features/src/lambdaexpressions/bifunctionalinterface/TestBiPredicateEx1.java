package lambdaexpressions.bifunctionalinterface;

import java.util.function.BiPredicate;

/*
 Normal Predicate can take only one input argument and perform some conditional check.
 sometimes our programming requirement is we have to take 2 input arguments and perform
 some conditional check, for this requirement we should go for BiPredicate.
 
 BiPredicate is exactly same as Predicate except that it will take 2 input arguments.
 
 interface BiPredicate<T1,T2>
 {
   public boolean test(T1 t1,T2 t2);
   //remaining default and static methods are same
 }
 
 Below are the Bi Functional interfaces
 (1)BiPredicate
 (2)BiFunction
 (3)BiConsumer
 
 Why BiSupplier Functional interface not available?
 Because, Supplier interface get() method wont take any arguments, just it will supply object.
 
 Primitive Predicate types
 --------------------------
 IntPredicate
 DoublePredicate
 LongPredicate
 
 */


// Program to check the sum of two inputs is an even or odd
public class TestBiPredicateEx1 {

	public static void main(String[] args) {
		
		BiPredicate<Integer,Integer> bp=(a,b)->(a+b)%2==0;

		System.out.println(bp.test(10,12));
		System.out.println(bp.test(5,6));
	}

}
