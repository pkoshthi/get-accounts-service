package lambdaexpressions.jodadatetime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TestZoneId {

	public static void main(String[] args) {
		
		ZoneId zone=ZoneId.systemDefault();
		System.out.println(zone);
		ZonedDateTime dt=ZonedDateTime.now();
		System.out.println("Current date time : "+dt);

		ZoneId laZone=ZoneId.of("America/Los_Angeles");
		ZonedDateTime laDt=ZonedDateTime.now(laZone);
		System.out.println("Current date time : "+laDt);
	}

}
