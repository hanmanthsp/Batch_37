package com.hrms.testscript;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC002 {

//public static void main(String[] args) {
		@Test
public void tc002() {
			
   DOMConfigurator.configure("Log4j.xml");	
		
   General obj = new General ();
	obj.openApplication();
	obj.login();
	obj.enterFrame();
    
    obj.exitFrame();
	obj.logout();
	obj.closeApplication();
	
	}
	
}
