package lambdaexpressions;

/*
 	We can define general utility methods inside interface with static
 */


public interface TestInterfMain {
	
	public static int sum(int a, int b)
 	{
 	 return a+b;
 	}
	
	public static void main(String args[])
	{
		System.out.println("Without class also, we can define and run the standard main method inside the interface");
		
		System.out.println(sum(10,20));
	}

}
