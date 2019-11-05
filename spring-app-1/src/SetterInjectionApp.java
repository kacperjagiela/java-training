import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterInjectionApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		CricketCoach coach = context.getBean("myCricketCoach", CricketCoach.class);

		System.out.println(coach.getWorkout());
		System.out.println(coach.getTeam());

		context.close();
	}
}
