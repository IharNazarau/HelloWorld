package com.epam.t1oop.action;
import java.util.ArrayList;

import com.epam.t1oop.entity.*;

public class Report {
	// Output all plains of airline in console 
	public void showListAirline(Airline airline){
		Airliner itPas;
		CargoPlain itCargo;
		int num=0, maxDist=0, fuelCons=0;
		String model = "";
		
		ArrayList<Plain> listPlains = airline.getListPlains(); 
		
		for (Plain item: listPlains ) {
			
			try {
				itPas = (Airliner)item;
				itPas.getInfoPlain(num, model, maxDist, fuelCons);
				showOneLine("PasLiner-" + num + model + maxDist + fuelCons);
			} finally {}
			try {
				itCargo = (CargoPlain)item; 
				itCargo.getInfoPlain(num, model, maxDist, fuelCons);
				showOneLine("GargoLiner-" + num + model + maxDist + fuelCons);
			} finally {}
			
			
		}
	}
	
	public void showOneLine(String str) {
		System.out.println(str);
	}
	
	public void showManyLines(String[] arrStr) {
		for (String oneLine: arrStr) {
			System.out.println(oneLine);
		}
	}
}
