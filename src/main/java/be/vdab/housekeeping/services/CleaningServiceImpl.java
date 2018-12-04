package be.vdab.housekeeping.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Lazy
@Profile("smallHouse")
public class CleaningServiceImpl implements CleaningService {
	private CleaningTool tool;
	private float rate;

	public CleaningServiceImpl() {
		System.out.println("Call cleaningservice");
	}

	@Autowired
	public void setCleaningTool(@Qualifier("broom") CleaningTool tool) {
		this.tool = tool;
	}

	@Value("${rate}")
	public void setRate(float rate) {
		this.rate = rate;
	}

	public float getRate() {
		return rate;
	}

	@Override
	public void clean() {
		System.out.println("Cleaning the house");
		tool.doCleanJob();
	}

}
