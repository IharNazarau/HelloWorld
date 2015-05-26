package com.epam.t1oop;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

//Runner class of Task1 "OOP". Theme: Airline. 
public class T1oopRunner {
	final static Logger LOG = Logger.getLogger(T1oopRunner.class);
	static {
	 	new DOMConfigurator().doConfigure("config/log4j.xml", LogManager.getLoggerRepository());
	}
	    
	public static void main(String[] args) {
		LOG.debug("Hello LOG both: file & console"); // Try to use logger
		// Here run main task - work with airline
		// ...
		
	}
	
	
}
