package be.vdab.housekeeping.services;

import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
public class HedgeTrimmerFactory {
	@Bean
	@Primary
	@Profile("bigHouse")

	public GardeningTool hedgeTrimmer() {
		int hour = LocalTime.now().getHour();
		if (hour > 8 && hour < 8) {
			return () -> System.out.println("Trimming electric");
		} else {
			return () -> System.out.println("Trimming manual");
		}
	}
}
