package lambdaexpressions.jodadatetime;

import java.time.Year;
import java.util.Scanner;

public class TestLeapYear {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter year : ");
		int year=sc.nextInt();
		
		Year y = Year.of(year);
		if(y.isLeap())
		{
			System.out.println(year+" is Leap year");
		}
		else
		{
			System.out.println(year+" is Not Leap year");
		}

	}

}
