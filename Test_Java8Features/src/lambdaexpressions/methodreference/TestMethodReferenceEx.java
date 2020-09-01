package lambdaexpressions.methodreference;

public class TestMethodReferenceEx {

	public void test()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Child thread");
		}
	}
	
	public static void main(String[] args) {
		
		// Method reference using objectReference::methodname
		TestMethodReferenceEx tref=new TestMethodReferenceEx();
		Runnable r=tref::test;
		Thread t=new Thread(r);
		t.start();
		
		for(int i=0;i<5;i++)
		{
			System.out.println("Main thread");
		}

	}

}
