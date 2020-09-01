package lambdaexpressions.jodadatetime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class TestPeriod {

	public static void main(String[] args) {
		
		LocalDate birthday=LocalDate.of(1988, Month.SEPTEMBER, 9);
		LocalDate today=LocalDate.now();
		
		Period period=Period.between(birthday, today);
		System.out.println("Period between birhday and today : "+period);
		
		System.out.printf("Your age is\n%d years %d months %d days",period.getYears(),period.getMonths(),period.getDays());

	}

}
