package com.Automation.Pages;

//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
	//Declaration
	@FindBy(id="txtUsername")
	private WebElement unTB;
	
	@FindBy(id="txtPassword")
	private WebElement pwTB;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement btnLogin;

	//Utilization
	public void enterUsername(String un)
	{
		unTB.sendKeys(un);
	}
	
	public void enterPassword(String pn)
	{
		pwTB.sendKeys(pn);
	}
	
	public void clickLogin()
	{
		btnLogin.click();
	}
	
	public void openWebsite()
	{
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
}
