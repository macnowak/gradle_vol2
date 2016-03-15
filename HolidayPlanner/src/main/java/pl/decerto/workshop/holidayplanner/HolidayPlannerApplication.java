package pl.decerto.workshop.holidayplanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("pl.decerto.workshop.holidayplanner")
public class HolidayPlannerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HolidayPlannerApplication.class, args);
	}
}
