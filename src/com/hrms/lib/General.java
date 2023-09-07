package com.hrms.lib;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.hrms.utility.Log;

public class General extends Global {
// To provide All re - usable fun : related Whole Application 
	public void openApplication () {
		 driver = new FirefoxDriver();
		 driver.navigate().to(url);
		 System.out.println("Application opened" );
		 Reporter.log("Applivation opened");
		 Log.info("Application opened");
		}
	public void closeApplication() {
		driver.close();
	}
	public void login () {
		driver.findElement(By.name(txt_loginname)).sendKeys(un);
		driver.findElement(By.name(txt_password)).sendKeys(pw);
		driver.findElement(By.name(btn_login)).click();
		System.out.println("Login completed");
		Reporter.log("Login completed");
		 Log.info("Login completed");
	}
	public void logout() {
		driver.findElement(By.linkText(link_logout)).click();
		System.out.println("Logout completed");
		Reporter.log("Logout completed");
		 Log.info("Logout completed");
	}
	public void enterFrame() {
		driver.switchTo().frame(frame_empinfo);
		System.out.println("Entered into Frame");
		Reporter.log(" Entered into Frame");
		 Log.info("Entered into Frame");
	}
	public void exitFrame() {
		driver.switchTo().defaultContent();
		System.out.println("Exite from frame");
		Reporter.log("Exite from frame");
		 Log.info("Exite from frame");
		}
	
	public void addNewEmp() {
		driver.findElement(By.xpath(btn_Add)).click();
		driver.findElement(By.name(txt_efn)).sendKeys(efn);
		driver.findElement(By.name(txt_eln)).sendKeys(eln);
		driver.findElement(By.id(btn_save)).click();
		System.out.println("New Emp Added ");
		Reporter.log("New Emp Added ");
		 Log.info("New Emp Added ");
	}
   public void editempl() {
	   driver.findElement(By.linkText(empname)).click();
	   driver.findElement(By.name(btn_edit)).click();
	   driver.findElement(By.name(txt_firstname)).sendKeys("Krish");
	   driver.findElement(By.name(txt_lastname)).sendKeys("Kolikar");
	   driver.findElement(By.id(btn_save)).click();
	   Reporter.log("Edit Emp");
		 Log.info("Edit Emp");
   }
   public void deleteEmp() {
	  // driver.findElement(By.id(txt_search)).click();
	  Select st=new Select(driver.findElement(By.id(txt_search)));
	  st.selectByVisibleText("Emp. ID");
	   driver.findElement(By.name(btn_search)).sendKeys("1572");
	   driver.findElement(By.className(button_Search)).click();
	   driver.findElement(By.className(chk_box)).click();
	   driver.findElement(By.xpath(btn_delete)).click();
	   Reporter.log("Delete emp id");
		 Log.info("Delete emp id");
   }

	
}
		
	
	

