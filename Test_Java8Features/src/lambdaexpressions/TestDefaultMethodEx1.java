package lambdaexpressions;

/*
 	Default method  OR Virtual extension method OR Defender method
 
 	Without effecting the implementation classes, if we want to add new methods to the interfaces ===> Default methods
 */

interface Interf
{
	default void m1()
	{
		System.out.println("Default method");
	}
}

public class TestDefaultMethodEx1 implements Interf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestDefaultMethodEx1 test = new TestDefaultMethodEx1();
		test.m1();
	}

}
