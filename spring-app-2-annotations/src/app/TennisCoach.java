package app;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach, InitializingBean, DisposableBean {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;

	public TennisCoach() {
		System.out.println("default constructor");
	}


	public void initMethod(){
		System.out.println("Init");
	}

	public void destroyMethod(){
		System.out.println("Destroy");
	}



	//@Autowired
	//public void setFortuneService(FortuneService fortuneService) {
	//	System.out.println("setFortune");
	//	this.fortuneService = fortuneService;
	//}

	//@Autowired
	//public TennisCoach(FortuneService fortuneService) {
	//	this.fortuneService = fortuneService;
	//}

	@Override
	public String getDailyWorkout() {
		return "Practice tennis";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
