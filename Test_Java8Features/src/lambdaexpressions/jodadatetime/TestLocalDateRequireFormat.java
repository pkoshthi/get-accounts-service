package lambdaexpressions.jodadatetime;

import java.time.LocalDate;

public class TestLocalDateRequireFormat {

	public static void main(String[] args) {
		
		LocalDate date=LocalDate.now();
		
		int dd=date.getDayOfMonth();
		int mm=date.getMonthValue();
		int yyyy=date.getYear();
		
		System.out.println(dd+"/"+mm+"/"+yyyy);
		
		System.out.printf("%d-%d-%d",dd,mm,yyyy);

	}

}
