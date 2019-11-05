public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getFortune() {
        return "Just do it: "+fortuneService.getFortune();
    }
}
