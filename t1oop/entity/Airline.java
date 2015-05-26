package com.epam.t1oop.entity;
import java.util.ArrayList;

// Airline as some set of any plains
public class Airline {
	private ArrayList<Plain> listPlains = new ArrayList<Plain>() ;
	
	// Add plain to airline park
	public void addPlain(Plain itemPlain ){
	  listPlains.add(itemPlain);
	}
	
	// Remove plain from airline park
	public void removePlain(Plain itemPlain ){
		listPlains.remove(itemPlain);
		  }

	public ArrayList<Plain> getListPlains() {
		return listPlains;
	}

}
