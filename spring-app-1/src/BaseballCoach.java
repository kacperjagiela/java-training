public class BaseballCoach implements Coach{

    private FortuneService fortuneService;

    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getWorkout(){
        return "Spend 1 hour running";
    }

    @Override
    public String getFortune() {
        return fortuneService.getFortune();
    }
}
