package be.vdab.housekeeping.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DomesticServiceImpl implements DomesticService {
	private CleaningService cs;
	private GardeningServiceImpl gs;

	@Autowired
	public void setCs(CleaningService cs) {
		this.cs = cs;
	}

	@Autowired
	public void setGs(GardeningServiceImpl gs) {
		this.gs = gs;
	}

	@Override
	public void runHousehold() {
		System.out.println("Running household");
		cs.clean();
		gs.garden();
	}

}
