package be.vdab.housekeeping.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GardeningServiceImpl implements GardeningService {
	private GardeningTool tool;

	@Autowired
	public void setGardeningTool(GardeningTool tool) {
		this.tool = tool;
	}

	public void init() {
		System.out.println("Gs preparing for work");
	}

	public void destroy() {
		System.out.println("Gs cleaning up");
	}

	@Override
	public void garden() {
		System.out.println("Working in the garden");
		tool.doGardenJob();
	}
}
