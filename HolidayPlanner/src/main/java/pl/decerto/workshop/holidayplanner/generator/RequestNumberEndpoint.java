package pl.decerto.workshop.holidayplanner.generator;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import org.springframework.stereotype.Component;

@Component
@Path("request/number")
public class RequestNumberEndpoint {

	@GET
	public String generate() {
		return RequestNumberGenerator.generate();
	}

}
