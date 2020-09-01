package lambdaexpressions.jodadatetime;

import java.time.LocalDateTime;

public class TestLocalDateTimeRequireFormat {

	public static void main(String[] args) {
		
		LocalDateTime dateTime=LocalDateTime.now();
		
		int dd=dateTime.getDayOfMonth();
		int mm=dateTime.getMonthValue();
		int yyyy=dateTime.getYear();
		
		int hour=dateTime.getHour();
		int min=dateTime.getMinute();
		int sec=dateTime.getSecond();
		int nano=dateTime.getNano();
		
		System.out.printf("%d-%d-%d  %d:%d:%d:%d", dd,mm,yyyy,hour,min,sec,nano);

	}

}
