package be.vdab.housekeeping.services;

import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@Order(2)
@Profile("!smallHouse")
public class VacuumCleaner implements CleaningTool {
	public VacuumCleaner() {
		System.out.println("Call vacuum");
	}

	@Override
	public void doCleanJob() {
		System.out.println("Zuuuuuu");
	}
}
