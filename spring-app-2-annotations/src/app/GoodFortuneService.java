package app;

import org.springframework.stereotype.Component;

@Component
public class GoodFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Git gud today";
	}
}
