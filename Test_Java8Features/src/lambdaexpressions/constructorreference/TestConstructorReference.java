package lambdaexpressions.constructorreference;

class Sample
{
	public Sample(String s)
	{
		System.out.println("Sample class constructor execution : "+s);
	}
	
	public void sayHello()
	{
		System.out.println("Hello");
	}
}

interface Interf
{
	public Sample get(String s);
}


public class TestConstructorReference {

	public static void main(String[] args) {
		
		Interf i=Sample::new;
		Sample obj = i.get("India");
		obj.sayHello();

	}

}
