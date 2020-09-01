package lambdaexpressions.jodadatetime;

import java.time.LocalTime;

public class TestLocalTimeRequireFormat {

	public static void main(String[] args) {
		
		LocalTime time=LocalTime.now();
		
		int hour=time.getHour();
		int min=time.getMinute();
		int sec=time.getSecond();
		int nano=time.getNano();
		
		System.out.printf("%d:%d:%d:%d", hour,min,sec,nano);

	}

}
