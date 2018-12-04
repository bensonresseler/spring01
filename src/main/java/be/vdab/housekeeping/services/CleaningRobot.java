package be.vdab.housekeeping.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Lazy
@Qualifier("robot")
@Profile("bigHouse")
public class CleaningRobot implements CleaningService {
	private List<CleaningTool> tools;

	@Autowired
	public void setTools(List<CleaningTool> tools) {
		this.tools = tools;
	}

	@Override
	public void clean() {
		System.out.println("Cleaning the house");
		tools.forEach(CleaningTool::doCleanJob);
	}

}
