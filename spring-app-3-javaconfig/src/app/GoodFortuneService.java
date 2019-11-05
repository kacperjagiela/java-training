package app;

import org.springframework.stereotype.Component;

@Component
public class GoodFortuneService implements FortuneService{
	@Override
	public String getDailyFortune() {
		return "Git gud";
	}
}
