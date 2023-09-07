package com.hrms.utility;

import org.apache.log4j.Logger;

public class Log {
  // initialize  Log4j logs
	private static Logger Log = Logger.getLogger(Log.class.getName());
	// need to create 
	public static void info (String message) {
		Log.info(message);
	}
}
