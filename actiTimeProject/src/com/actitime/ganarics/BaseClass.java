package com.actitime.ganarics;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.actitime.pom.HomePage;
import com.actitime.pom.LoginPage;

public class BaseClass {
	static {
		System.setProperty("webdriver.chrome.driver","./WebDriverFolder/chromedriver.exe");
	}
  public  static WebDriver driver;
	
	@BeforeClass
	public void openBrowes() { 
		Reporter.log("openBrowes");
		driver=new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	@AfterClass
	public void closeBrower() {
		Reporter.log("closeBrowes");
		driver.close();
	}
	@BeforeMethod
	public void login() throws IOException {
		Reporter.log("login");
		FileLibClass fi=new FileLibClass();
		String url = fi.getPropertys("url");
		driver.get(url);
		String un = fi.getPropertys("username");
		String pw = fi.getPropertys("password");
		LoginPage l=new LoginPage(driver);
		l.setlogin(un, pw);
	}
	@AfterMethod
	public void logout() {
		Reporter.log("logout");
		HomePage h=new HomePage(driver);
		h.setLoutBtn();
	}

	
	
}
