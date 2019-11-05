package app;

import org.springframework.stereotype.Component;

@Component
public class BadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Git bad";
	}
}
