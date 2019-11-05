package app;

public class SadFortuneService implements FortuneService{
	@Override
	public String getDailyFortune() {
		return "This is so sad";
	}
}
