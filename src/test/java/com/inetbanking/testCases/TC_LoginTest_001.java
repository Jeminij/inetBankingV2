package com.inetbanking.testCases;

import java.io.IOException;

import org.apache.log4j.Category;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;

import junit.framework.Assert;

public class TC_LoginTest_001 extends Baseclass{
	
	@Test
	public void loginTest()
	{
		
		logger.info("URL is opened");
		
		LoginPage lp=new LoginPage(driver);
		lp.setUsername(username);
		logger.info("Username is entered");
		
		lp.setPassword(password);
		logger.info("Password is entered");
		
		lp.clickSubmit();
		
		if(driver.getTitle().equals("Guru99 Bank Managers HomePage"))
				{
			Assert.assertTrue(true);
		logger.info("Test Case Passed");
				}
		else
		{
			try {
				captureScreen(driver,"loginTest");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Assert.assertTrue(false);
          logger.info("Test Case Failed");
	}
		
	}

	}
