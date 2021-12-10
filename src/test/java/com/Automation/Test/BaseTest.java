package com.Automation.Test;

//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.Automation.Generic.DriverUtils;

public class BaseTest {
	//@BeforeMethod
	@BeforeTest
	public void setUp()
	{
		DriverUtils.createDriver();
	}
}
