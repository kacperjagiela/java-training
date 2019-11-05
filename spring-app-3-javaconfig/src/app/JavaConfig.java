package app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("app")
@PropertySource("classpath:coach.properties")
public class JavaConfig {
	@Bean
	public FortuneService sadFortuneService(){
		return new SadFortuneService();
	}

	@Bean
	public Coach swimCoach(){
		return new SwimCoach(sadFortuneService());
	}
}
