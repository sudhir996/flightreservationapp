package com.flight_reservation_app;

import org.junit.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.flight_reservation_app.utilities.PdfGenerator;

@SpringBootApplication
public class FlightReservationAppApplication {

	private static final String String = null;

	public static void main(String[] args) {
		SpringApplication.run(FlightReservationAppApplication.class, args);
	}
	
	@Test
	void PdfGenerator() {
		PdfGenerator pdf = new PdfGenerator();
		pdf.writeUsingIText(String , String, String, String, String, null, String, String);
	}
}
