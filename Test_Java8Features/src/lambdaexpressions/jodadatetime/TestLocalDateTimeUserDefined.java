package lambdaexpressions.jodadatetime;

import java.time.LocalDateTime;
import java.time.Month;

public class TestLocalDateTimeUserDefined {

	public static void main(String[] args) {
		
		LocalDateTime dt=LocalDateTime.of(1988, Month.SEPTEMBER, 9, 00, 55, 0);
		System.out.println(dt);
		
		System.out.println("After six months : "+dt.plusMonths(6));
		System.out.println("Before six months : "+dt.minusMonths(6));

	}

}
