package com.ocr.button;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fenetre fen = new Fenetre();
		Logger logger = LogManager.getRootLogger();
    	logger.trace("Configuration File Defined To Be :: "+System.getProperty("log4j.configurationFile"));
	}
}