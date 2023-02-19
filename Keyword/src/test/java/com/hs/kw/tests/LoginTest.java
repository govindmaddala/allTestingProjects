package com.hs.kw.tests;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.hs.engine.KeywordEngine;
import com.hs.engine.Prac;

public class LoginTest {

//	@Test
//	public void LoginTest() {
//		KeywordEngine.startExecution("Login");		
//	}
	
	@Test
	public void LoginTest2() throws InterruptedException {
		String pageTitle = Prac.Login("Login");	
//		Assert.assertEquals(pageTitle, "Facebook");
	}

}
