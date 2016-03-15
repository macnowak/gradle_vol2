package pl.decerto.workshop.holidayplanner.generator;

import java.util.UUID;

public class RequestNumberGenerator {

	public static String generate() {
		return UUID.randomUUID().toString();
	}
}
