package app;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach{

	private FortuneService fortuneService;

	@Value("${foo.name}")
	private String name;

	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getName() {
		return name;
	}

	@Override
	public String getDailyWorkout() {
		return "Swim";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}
}
