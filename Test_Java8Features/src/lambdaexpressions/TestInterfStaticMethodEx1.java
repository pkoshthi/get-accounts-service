package lambdaexpressions;

/*
   	We can access the interface static methods in "interface implementation class or Non implementation class" only by "interface name.static method"
 */

interface InterfStatic
{
	public static void m1()
	{
		System.out.println("Interface static method");
	}
}

//public class TestInterfStaticMethodEx1 {
public class TestInterfStaticMethodEx1 implements InterfStatic{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InterfStatic.m1();
		//m1(); // The method m1() is undefined for the type TestInterfStaticMethodEx1
		//TestInterfStaticMethodEx1.m1();  // The method m1() is undefined for the type TestInterfStaticMethodEx1
		// new TestInterfStaticMethodEx1().m1();  // The method m1() is undefined for the type TestInterfStaticMethodEx1
		
	}

}
