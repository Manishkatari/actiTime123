package com.actitime.testscript.FunctionTestCase;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.actitime.ganarics.BaseClass;
import com.actitime.pom.LoginPage;


@Listeners(com.actitime.ganarics.LisearesClass.class)
public class LoginPageTestScript extends BaseClass  {
	
	@Test
	public void login1() {
		LoginPage lg=new LoginPage(driver);
     	lg.setlogin("admin1","manager");
     }


}
