package lambdaexpressions.methodreference;

interface Interf
{
	public void add(int x,int y);
}

public class TestMethodReferenceEx1 {

	private static void sum(int a,int b)
	{
		System.out.println("The sum : "+(a+b));
	}
	
	public static void main(String[] args) {
		
		Interf i=(a,b)->{
			System.out.println("The sum :"+(a+b));
		};
		i.add(10, 20);
		
		
		Interf i1=TestMethodReferenceEx1::sum;
		i1.add(2,6);

	}

}
