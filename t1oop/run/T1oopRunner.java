package com.epam.t1oop.run;

import com.epam.t1oop.entity.*;
import com.epam.t1oop.action.Report;
//import java.util.ArrayList;

public class T1oopRunner {

	public static void main(String[] args) {
		// Create Airline object for test
		Airline testAirline = new Airline();
		// Hardcode. Fill test airline by plain items.
		// Passenger
		Airliner itemAirliner = new Airliner(1,"Boeing 737",5000,3500,120);
		testAirline.addPlain(itemAirliner);
		// Cargo
		CargoPlain itemCargoPlain = new CargoPlain(1,"Airbus 3000",8500,5200,21000);
		testAirline.addPlain(itemCargoPlain);
		// Output
		Report rep = new Report();
		rep.showListAirline(testAirline);

	}

}
