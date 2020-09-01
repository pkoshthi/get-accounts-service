package lambdaexpressions;

/*
 Anonymous inner class != Lambda expression
 If anonymous inner class implements an interface that contains single abstract method, then only we can replace 
 anonymous inner class with lambda expression.
 
 Anonymous inner class can extend a normal class
 Anonymous inner class can extend an abstract class
 Anonymous inner class can implement an interface which can have any number of abstract methods in it.
 
 But, Lambda expression can implement an interface which contains only one abstract method(Functional interface)
 
 So, Anonymous inner class > Lambda expression
 */

public class MultiThreadingEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Implementation of Runnable interface using Anonymous inner class concept
		Runnable r=new Runnable()
		{
			public void run()
			{
				for(int i=0;i<10;i++)
				{
					System.out.println("Child Thread");
				}
			}
		};

		Thread t = new Thread(r);
		t.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("Main Thread");
		}
	}

}
