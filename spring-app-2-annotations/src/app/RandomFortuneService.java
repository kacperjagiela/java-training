package app;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

	private String[] fortunes = {
		"1",
		"2",
		"3"
	};

	private Random random = new Random();

	@Override
	public String getFortune() {
		int index = random.nextInt(fortunes.length);
		return fortunes[index];
	}
}
