package com.epam.t1oop.entity;

public abstract class Plain {
// Fields (at first minimum for task)
	private int boardNum;        // Plane board number
	private String modelPlain;   // Full model: brand + model (Ex.: Boeing 747)
	private int maxDistance;     // km
	private int fuelConsumption; // kg in hour 

	// Constructor   
	public Plain(int boardNum, String modelPlain, int maxDistance,
			int fuelConsumption) {
		setBoardNum(boardNum);
		setModelPlain(modelPlain);
		setMaxDistance(maxDistance);
		setFuelConsumption(fuelConsumption);
	}
	
	// Methods	
	public int getBoardNum() {
		return boardNum;
	}
	public void setBoardNum(int boardNum) {
		this.boardNum = boardNum;
	}

	public String getModelPlain() {
		return modelPlain;
	}
	public void setModelPlain(String modelPlain) {
		this.modelPlain = modelPlain;
	}

	public int getMaxDistance() {
		return maxDistance;
	}
	public void setMaxDistance(int maxDistance) {
		this.maxDistance = maxDistance;
	}
	public int getFuelConsumption() {
		return fuelConsumption;
	}
	public void setFuelConsumption(int fuelConsumption) {
		this.fuelConsumption = fuelConsumption;
	}
	
}
