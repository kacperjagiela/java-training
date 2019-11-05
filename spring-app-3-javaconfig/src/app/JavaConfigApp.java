package app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

		SwimCoach coach = context.getBean("swimCoach", SwimCoach.class);

		System.out.println(coach.getDailyWorkout());

		System.out.println(coach.getDailyFortune());

		System.out.println(coach.getName());

		context.close();
	}
}
