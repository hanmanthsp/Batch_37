package com.hrms.testscript;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;
import com.hrms.lib.General;

public class TC001 {
// Test Steps 
	//public static void main (String args []) {
		@Test 
		public void tc001() {
			DOMConfigurator.configure("Log4j.xml");
		General obj = new General ();
		obj.openApplication();
		obj.login();
		obj.logout();
		obj.closeApplication();
	}
}
