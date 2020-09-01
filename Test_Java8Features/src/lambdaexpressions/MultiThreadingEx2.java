package lambdaexpressions;

public class MultiThreadingEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Functional interface = An interface which has only one abstract method in it
		// Since Runnable interface is Functional interface, we can implement the run method as below using lambda expression
		Runnable r=()->{
			for(int i=0;i<10;i++)
			{
				System.out.println("Child thread");
			}
		};
		
		Thread t=new Thread(r);
		t.start();
		
		for(int i=0;i<10;i++)
		{
			System.out.println("Main thread");
		}
	}

}
