package be.vdab.housekeeping.services;

import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@Order(1)
@Profile("smallHouse")
public class Broom implements CleaningTool {
	public Broom() {
		System.out.println("Call broom");
	}

	@Override
	public void doCleanJob() {
		System.out.println("Scrub scrub");
	}

}
