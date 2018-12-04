package be.vdab.housekeeping.services;

import org.springframework.context.annotation.Scope;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@Order(3)
public class Sponge implements CleaningTool {
	public Sponge() {
		System.out.println("Call sponge");
	}

	@Override
	public void doCleanJob() {
		System.out.println("Wash wash");
	}
}
