package lambdaexpressions;

interface testInterf
{
	default void m1()
	{
		System.out.println("Default method");
	}
}


public class TestDefaultMethodEx2 {

	public void m1()
	{
		System.out.println("Overriding version of default method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestDefaultMethodEx2 test = new TestDefaultMethodEx2();
		test.m1();
	}

}
