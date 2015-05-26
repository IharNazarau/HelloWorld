package com.epam.t1oop.entity;

// Passenger plain
public class Airliner extends Plain {
	private int maxPassengers;
	public Airliner(int boardNum, String modelPlain, int maxDistance,
			int fuelConsumption, int maxPassengers) {
		
		super(boardNum, modelPlain, maxDistance, fuelConsumption);
		setMaxPassengers(maxPassengers); 
	}
	public int getMaxPassengers() {
		return maxPassengers;
	}
	public void setMaxPassengers(int maxPassengers) {
		this.maxPassengers = maxPassengers;
	}
	

}
