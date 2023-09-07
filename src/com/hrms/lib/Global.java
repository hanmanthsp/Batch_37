package com.hrms.lib;

import org.openqa.selenium.WebDriver;

public class Global {
// stnd rule : To provided Test Data & object related to whole application
	public WebDriver driver;
	///       DT  v      vv 
	public String url = "http://183.82.103.245/nareshit/login.php";
	public String un = "nareshit";
	public String pw = "nareshit";
	public String efn = "Mr.Krishna";
	public String eln = "Koli";
	
	// *********Object / element 
	
	public String txt_loginname = "txtUserName";
	public String txt_password = "txtPassword";
	public String btn_login = "Submit";
	public String link_logout = "Logout";
	public String frame_empinfo = "rightMenu";
	public String btn_Add = "/html/body/div/div[2]/form/div[3]/div[1]/input[1]";
	public String txt_efn = "txtEmpFirstName";
	public String txt_eln = "txtEmpLastName";
	public String empname = "Employee Name ";
	public String btn_save = "btnEdit";
	public String btn_edit = "EditMain";
	public String btn_save1 = "btnEditpers";
	public String txt_firstname ="txtEmpFirstName";
	public String txt_lastname = "txtEmpLastName";
	public String txt_search = "loc_code";
	public String search_empid ="loc_code";
	public String btn_search = "loc_name";
	public String button_Search="plainbtn";
	public String chk_box="checkbox";
	public String btn_delete = "//*[@id=\"standardView\"]/div[3]/div[1]/input[2]";
	
}
