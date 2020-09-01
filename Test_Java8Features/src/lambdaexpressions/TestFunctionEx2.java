package lambdaexpressions;

import java.util.function.Function;


// Program to perform various operations using Function
public class TestFunctionEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Function to return length of string by taking input string
		Function<String,Integer> f=s->s.length();
		String s="Karnataka";
		System.out.println("Length of string "+s+" : "+f.apply(s));
		
		//Function to return upper case of input string
		Function<String,String> f1=s1->s1.toUpperCase();
		System.out.println("Uppaercase of string "+s+" : "+f1.apply(s));
		
	}

}
