package lambdaexpressions;

import java.util.function.Supplier;


// Program to generate 6 digit OTP 
public class TestSupplierEx2 {

	public static void main(String[] args) {
		
		Supplier<String> s=()->{
			 String otp="";
			 for(int i=0;i<6;i++)
			 {
				 otp=otp+(int)(Math.random()*10);
			 }
			 return otp;
		};

		System.out.println("Random OTP generation");
		for(int i=0;i<6;i++)
		{ 
			System.out.println(s.get());
		}
	}

}
