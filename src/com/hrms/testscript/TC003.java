package com.hrms.testscript;

import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC003 {

	//public static void main(String[] args) {
	@Test
	public void tc003 () {
		
     General obj = new General ();
     obj.openApplication();
     obj.login();
     obj.enterFrame();
     obj.exitFrame();
     obj.logout();
     obj.closeApplication();
	}
}

