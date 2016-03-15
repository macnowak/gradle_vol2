package pl.decerto.workshop.holidayplanner.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;
import pl.decerto.workshop.holidayplanner.generator.RequestNumberEndpoint;

@Configuration
public class JerseyConfig extends ResourceConfig {

	public JerseyConfig() {
		register(RequestNumberEndpoint.class);
	}

}
