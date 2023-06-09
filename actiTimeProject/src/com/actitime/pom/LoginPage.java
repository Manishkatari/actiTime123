package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	@FindBy(id="username")
	private WebElement untbx;
	
	@FindBy(name="pwd")
	private WebElement pwtbx;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement logBtn;
	
	@FindBy(xpath="(//span[@class='errormsg'])[1]")
	private WebElement errormsg;
	
	public  LoginPage(WebDriver driver) {
		PageFactory.initElements( driver, this);
	}
     
	public void setlogin(String un,String pwt) {
		  
		  untbx.sendKeys(un);
		  pwtbx.sendKeys(pwt);
		  logBtn.click();
	  }

}
