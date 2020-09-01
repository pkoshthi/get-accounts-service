package lambdaexpressions;

interface Left
{
	default void m1()
	{
		System.out.println("Left default method");
	}
}

interface Right
{
	default void m1()
	{
		System.out.println("Right default method");
	}
}

public class TestDefaultMethodEx3 implements Left,Right {

	public void m1()
	{
		//System.out.println("Overriding interface default method m1");
		//Left.super.m1();
		Right.super.m1();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestDefaultMethodEx3 test=new TestDefaultMethodEx3();
		test.m1();
		
	}

}
