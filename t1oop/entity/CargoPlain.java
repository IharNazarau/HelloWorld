package com.epam.t1oop.entity;

public class CargoPlain extends Plain {
	private int maxCargo; // max cargo in kg
	public CargoPlain(int boardNum, String modelPlain, int maxDistance,
			int fuelConsumption,int maxCargo) {
		super(boardNum, modelPlain, maxDistance, fuelConsumption);
		setMaxCargo(maxCargo);
	}
	public int getMaxCargo() {
		return maxCargo;
	}
	public void setMaxCargo(int maxCargo) {
		this.maxCargo = maxCargo;
	}
  
}
