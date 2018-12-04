package be.vdab.housekeeping.services;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype", proxyMode = ScopedProxyMode.INTERFACES)
@Order(4)
public class DisposableDuster implements CleaningTool {
	private boolean used = false;

	public DisposableDuster() {
		System.out.println("Call disposable duster");
	}

	@Override
	public void doCleanJob() {
		if (used) {
			System.out.println("Used, trhow away!");
		} else {
			System.out.println("Wipe wipe");
			used = true;
		}
	}
}
