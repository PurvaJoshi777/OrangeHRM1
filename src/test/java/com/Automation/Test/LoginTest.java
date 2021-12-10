package com.Automation.Test;

import org.testng.annotations.Test;

import com.Automation.Generic.PropertyReader;
import com.Automation.Pages.AddUserPage;
import com.Automation.Pages.LoginPage;

public class LoginTest extends BaseTest{
	LoginPage lp=new LoginPage();
	AddUserPage ref=new AddUserPage();
	@Test(priority=0)
	public void VerifyLogin()
	{
		lp.openWebsite();
		PropertyReader.init();
		//lp.enterUsername("Admin");
		lp.enterUsername(PropertyReader.getProperty("login.username"));
		//lp.enterPassword("admin123");
		lp.enterPassword(PropertyReader.getProperty("login.pass"));
		lp.clickLogin();
	}
	
	@Test(priority=1)
	public void VerifyAddUser()
	{
		 ref.Action();
		 PropertyReader.init();
		 ref.SelectRole();
		 //ref.enterEname("Purva Joshi");
		 ref.enterEname(PropertyReader.getProperty("admin.ename"));
		// ref.enterUname("Purva");
		 ref.enterUname(PropertyReader.getProperty("admin.uname"));
		 ref.SelectStatus();
		 //ref.enterPwd("Purva@123");
		 ref.enterPwd(PropertyReader.getProperty("admin.pass"));
		 //ref.enterCPwd("Purva@123");
		 ref.enterCPwd(PropertyReader.getProperty("admin.cpass"));
		 ref.clickSave();
	}
}
