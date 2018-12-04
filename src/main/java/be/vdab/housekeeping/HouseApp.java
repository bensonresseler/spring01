package be.vdab.housekeeping;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import be.vdab.housekeeping.services.CleaningServiceImpl;
import be.vdab.housekeeping.services.DomesticService;

public class HouseApp {

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext()) {
			System.out.println("Container initialized");
			ctx.getEnvironment().setActiveProfiles("smallHouse");
			ctx.register(AppConfig.class);
			ctx.refresh();
			DomesticService service = ctx.getBean("domesticServiceImpl", DomesticService.class);
			service.runHousehold();

			CleaningServiceImpl cs = ctx.getBean("cleaningServiceImpl", CleaningServiceImpl.class);

			System.out.println(cs.getRate());
		}
	}
}
