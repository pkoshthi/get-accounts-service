package lambdaexpressions.methodreference;

public class TestMethodReference {

	public static int test()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Child thread");
		}
		return 1;
	}
	
	public static void main(String[] args) {
		
		// Method reference using classname::methodname
		// Method return type can be anything, Only method arguments must and should be matched
		// "public void run()" is referring to "public static int test()"
		Runnable r=TestMethodReference::test;
		Thread t=new Thread(r);
		t.start();
		
		for(int i=0;i<5;i++)
		{
			System.out.println("Main thread");
		}

	}

}
