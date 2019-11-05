public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private String team;

	public CricketCoach() {

	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
		System.out.println("Setting team");
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getWorkout() {
		return "Cricket workout";
	}

	@Override
	public String getFortune() {
		return fortuneService.getFortune();
	}
}
